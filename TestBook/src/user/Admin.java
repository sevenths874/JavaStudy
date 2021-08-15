package user;

import java.util.Scanner;

public class Admin extends User {
    public Admin(String name) {
        super(name);
    }

    @Override
    public int menu() {
        System.out.println("============================================");
        System.out.println("Hello " + this.name + "!  " + "欢迎来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("============================================");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }
}
