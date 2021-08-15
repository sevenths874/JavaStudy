import book.BookList;
import user.Admin;
import user.Normal;
import user.User;
import java.util.Scanner;


public class TestMain {

    public static User login() {
        System.out.println("请输入姓名：");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("请输入你的身份：1--》Admin, 2--》Normal");
        int choice = scan.nextInt();
        if(choice == 1) {
            return new Admin(name);
        }else {
            return new Normal(name);
        }
    }

    public static void main(String[] args) {
        System.out.println("xxxx");
        //准备书籍
        BookList booklist = new BookList();

        //登录
        User user = login();

        while(true) {
            int choice = user.menu();
            //选择对应的方法

        }
    }
}
















