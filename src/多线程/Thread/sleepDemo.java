package 多线程.Thread;

public class sleepDemo {
    public static void main(String[] args) throws InterruptedException {

        for (int i=0;i<20;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
