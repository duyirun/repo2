package yiChangDemo;

public class tryCatch {
    public static void main(String[] args) {
        try {

            int a = 10 / 0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("被除数不能为0");
        }

    }
}

