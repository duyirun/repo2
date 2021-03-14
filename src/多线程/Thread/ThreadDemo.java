package 多线程.Thread;

public class ThreadDemo {
    public static void main(String[] args) {
        myThread my=new myThread();
        my.start();
        for(int i=0;i<20;i++)
        {

            System.out.println("main"+i);
        }
    }
}
