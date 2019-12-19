package by.huangsai;

import java.util.Scanner;

public class TestHotelManager {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        HotelManager customer = new HotelManager();
        System.out.println("*****************************************");
        System.out.println("\t欢迎进入白云工商技术学院酒店管理系统");
        System.out.println("*****************************************");
        while (true) {
            System.out.println("请选择操作:1.顾客入住登记  2.显示顾客列表  3.查找顾客  4.修改顾客手机号码  5.计费,退房");
            int input = sca.nextInt();      //选择操作
            switch (input) {
                case 1:
                    while (true) {
                        System.out.print("请输入顾客姓名:");
                        String name = sca.next();       //输入姓名
                        System.out.print("请输入顾客性别:");
                        String gender = sca.next();     //输入性别
                        System.out.print("请输入顾客身份证号码:");
                        long id = sca.nextLong();       //输入身份证号码
                        System.out.print("请输入顾客电话号码:");
                        String phone = sca.next();      //输入电话号码
                        System.out.print("是否会员(true/false):");
                        boolean member = sca.nextBoolean(); //是否会员
                        System.out.print("入住天数:");
                        int number = sca.nextInt();     //输入天数
                        HotelCustomer hotel2 = new HotelCustomer(name, gender, id, phone, member, number);
                        customer.addCustomer(hotel2);
                        System.out.print("继续登记吗?(y/n):");
                        String register = sca.next();   //是否继续
                        if (register.equals("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    customer.showInfo();
                    break;
                case 3:
                    System.out.print("请输入需要查找顾客名字:");
                    String name = sca.next();
                    if (customer.searchCustomer(name) == true) {
                        System.out.println("找到了该顾客!");
                    } else {
                        System.out.println("顾客不存在!");
                    }
                    break;
                case 4:
                    System.out.print("请输入要修改的顾客姓名:");
                    String name2 = sca.next();
                    System.out.print("请输入新的电话号码:");
                    String newPhone = sca.next();
                    if (customer.editPhone(name2, newPhone) == true) {
                        System.out.println("找到并修改成功!");
                    } else {
                        System.out.println("顾客不存在修改不成功!");
                    }
                    customer.showInfo();
                    break;
                case 5:
                    customer.judge();
                    System.out.print("请输入要退房的顾客姓名:");
                    String name3 = sca.next();
                    System.out.println("您的住宿费用是:" + customer.fee(name3) + "元,欢迎下次再来入住!祝您生活愉快!");
                    return;
            }
        }
    }
}
