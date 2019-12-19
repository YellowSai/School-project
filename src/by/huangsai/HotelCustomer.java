package by.huangsai;

public class HotelCustomer {
    private String name;    //姓名
    private String gender;  //性别
    private long id;        //身份证号码
    private String phone;      //电话号码
    private boolean member; //会员
    private int number;     //入住天数

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public int setPhone(String phone) {
        if (phone.charAt(0) == '1' && phone.length() == 11) {
            this.phone = phone;
            return 1;
        }else {
            return 2;
        }
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public HotelCustomer() {

    }

    public HotelCustomer(String name, String gender, long id, String phone, boolean member, int number) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.phone = phone;
        this.member = member;
        this.number = number;
    }

    @Override
    public String toString() {
        return "姓名='" + name + '\'' +
                ", 性别='" + gender + '\'' +
                ", 身份证号码=" + id +
                ", 电话号码=" + phone +
                ", 会员=" + member +
                ", 入住天数=" + number;
    }
}
