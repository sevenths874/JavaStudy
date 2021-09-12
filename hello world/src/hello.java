///*
//import java.util.Scanner;
//import java.io.IOException;
//public class hello {
//    public static void main(String[] args) {
//        */
///*for(int i=0;i<args.length;++i){
//            System.out.println(args[i]);
//        }*//*
//
//
//        int a = 10;
//        int b = 20;
//        System.out.println("a = " + a + "  b = " + b);
//
//        */
///*int num = 10;
//        String str1 = num + "";
//        System.out.println(num);
//        String str2 = String.valueOf(num);
//        System.out.println(num);*//*
//
//
//        //System.out.println("Hello World!");
//
//        //Scanner scan = new Scanner(System.in);
//        //int num = scan.nextInt();
//        //System.out.println(num);
//        //String str = scan.nextLine();
//        //System.out.println(str);
//
//        */
///*try {
//            System.out.print("Enter a Char:");
//            char i = (char) System.in.read();
//            System.out.println("your char is :"+i);
//        } catch (IOException e) {
//            System.out.println("exception");
//        }*//*
//
//
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        String s = scan.next();
//        String str = scan.nextLine();
//        System.out.println(num);
//        System.out.println(str);
//
//    }
//}
//
//*/
//
/////*import java.util.Arrays;
////import java.util.Scanner;
////public class hello{
////    public static void main(String[] args){
////        System.out.println("hello");
////
////        //Scanner scan = new Scanner(System.in);
////        //String str = scan.nextLine();
////        //System.out.println(str);
////
////        *//*//*/计算1!+2!+3!+4!+5！
////        int sum = 0;
////        for(int i = 1;i <= 5;++i){
////            int tmp = 1;
////            for(int j = 1;j <= i;++j){
////                tmp *= j;
////            }
////            sum += tmp;
////        }
////        System.out.println("sum = "+ sum);*//*
////
////        int ret1 = Add(10,20);
////        double ret2 = Add(10.1,20.1);
////        System.out.println(ret1);
////        System.out.println(ret2);
////
////        //int[] arr = {10, 20};
////        //swap(arr);
////        //System.out.println("arr[0]=" + arr[0] + " arr[1]=" + arr[1]);
////
////        //数组的使用
////        int[] arr = {1, 2, 3, 4};
////        int len = arr.length;
////        System.out.println("length = " + len);
////        for(int i = 0;i < arr.length;++i){
////            System.out.println(arr[i]);
////        }
////        System.out.println();
////        //for-each
////        for(int j : arr){
////            System.out.println(j);
////        }
////
////        System.out.println();
////        int[] out = transform(arr);
////        for(int i = 0;i < out.length;++i){
////            System.out.println(out[i]);
////        }
////
////        String newArr = Arrays.toString(arr);
////        System.out.println(newArr);
////
////        int[] arr1 = {};
////
////
////    }
////
////    //重载
////    public static int Add(int x, int y){
////        return x + y;
////    }
////
////    public static double Add(double x, double y){
////        return x + y;
////    }
////
////    public static void swap(int[] arr){
////        int tmp = arr[0];
////        arr[0] = arr[1];
////        arr[1] = tmp;
////    }
////
////    public static int[] transform(int[] arr){
////        int[] arr_tmp = new int[arr.length];
////        for(int i = 0;i < arr_tmp.length;++i){
////            arr_tmp[i] = arr[i] * 3;
////        }
////        return arr_tmp;
////    }
////
////}*/
//
////import java.util.Date;
//import java.util.*;
//class Person{
//    public int age = 10;
//    public String name = "cool";
//
//    public void eat(){
//        System.out.println("eat");
//    }
//    public void sleep(){
//        System.out.println("sleep");
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//}
//
//class hello{
//    public static void main(String[] args){
//        Person person = new Person();
//        //person.eat();
//        //person.sleep();
//        System.out.println(person);
//
//        Date date = new Date();
//        System.out.println(date.getTime());
//
//    }
//}
//
//
////public class hello {
////    public static void main(String[] args) {
////        int a = 10;
////        int b = 20;
////        System.out.println("第一次调用方法之前");
////        int ret = add(a, b);
////        System.out.println("第一次调用方法之后");
////        System.out.println("ret = " + ret);
////        System.out.println("第二次调用方法之前");
////        ret = add(30, 50);
////        System.out.println("第二次调用方法之后");
////        System.out.println("ret = " + ret);
////    }
////    public static int add(int x, int y) {
////        System.out.println("调用方法中 x = " + x + " y = " + y);
////        return x + y;
////    }
////}
//
//


import java.util.Arrays;

public class hello {
    public static void main(String[] args) {
        /*String str = "HelloWorld";
        boolean b = str.contains("hello");
        System.out.println(b);


        System.out.println();
        int[] arr = {1, 2, 3};
        try {
            System.out.println("before");
            System.out.println(arr[100]);
            System.out.println("after");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 打印出现异常的调用栈
            e.printStackTrace();
        }
        System.out.println("after try catch");*/

        int[] arr = {1, 2, 3, 4};
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));
        System.out.println();
        int[] arr1 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        //+++++++++++++++++++
        System.out.println("xxxxxx");
        System.out.println("xxxxxxxxxx");
        System.out.println("012345678910111267575757");
        //=================================
        //******************


    }
}

















