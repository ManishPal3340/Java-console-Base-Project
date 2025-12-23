package FirstDay;

class MyThread1 extends Thread{
    public void run(){

        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("MyThread1 is running");

    }
}

public class MyThreadExample1 {
    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        System.out.println("MyThread1 is running");

    }
}
