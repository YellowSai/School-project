package by.huangsai;

public class HotelManager {
    HotelCustomer[] hotelmer = new HotelCustomer[200];

    public void addCustomer(HotelCustomer customer) {    //增加顾客
        for (int i = 0; i < hotelmer.length; i++) {
            if (hotelmer[i] == null) {
                hotelmer[i] = customer;
                break;
            }
        }
    }

    public void showInfo() { //显示顾客所有信息
        for (int i = 0; i < hotelmer.length; i++) {
            if (hotelmer[i] != null) {
                System.out.println(hotelmer[i].toString());
            }
        }
    }

    public boolean searchCustomer(String name) {     //查找顾客
        boolean Return = false;
        for (int i = 0; i < hotelmer.length; i++) {
            if (name.equals(hotelmer[i].getName())) {
                Return = true;
                break;
            } else if (i == hotelmer.length - 1 && !name.equals(hotelmer[i])) {
                Return = false;
            }
        }
        return Return;
    }

    public boolean editPhone(String name, String newPhone) {  //查找顾客手机号码
        for (int i = 0; i < hotelmer.length; i++) {
            if (hotelmer[i] != null){
                if (name.equals(hotelmer[i].getName())) {
                    if (hotelmer[i].setPhone(newPhone) == 1){
                        return true;
                    }
                }
            } else if (hotelmer[i] == null && i==hotelmer.length-1) {
                return false;
            }
        }
        return false;
    }

    public double fee(String name) {
        double get = 180.0;
        for (int i = 0; i < hotelmer.length; i++) {
            if (name.equals(hotelmer[i].getName())) {
                if (hotelmer[i].isMember() == true) {
                    get = (get * hotelmer[i].getNumber()) * 0.85;
                } else {
                    get = get * hotelmer[i].getNumber();
                }
                break;
            } else {
                System.out.println("顾客不存在!");
            }
        }
        return get;
    }

    public boolean judge() {
        for (int i = 0; i < hotelmer.length; i++) {
            if (hotelmer[i] == null) {
                return true;
            }
        }
        return false;
    }
}
