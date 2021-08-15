package user;
import java.util.Scanner;

public class Normal extends User {
    public Normal(String name) {
        super(name);
    }

    @Override
    public int menu() {
        System.out.println("============================================");
        System.out.println("Hello " + this.name + "!  " + "欢迎来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("=============================================");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }
}
