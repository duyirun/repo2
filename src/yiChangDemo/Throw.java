package yiChangDemo;

public class Throw {

    public static void main(String[] args) throws Exception {
        show();
        System.out.println("执行");


    }
    public static void show() throws Exception{
        int a=10/0;
        System.out.println(a);
    }
}
