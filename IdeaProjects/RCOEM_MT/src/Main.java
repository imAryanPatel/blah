//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
Step 1 : Import the java.lang package
Step 2 : A) BY extending thread class
         B) By implementing Runnable Interface.
Step 3 : Initialized the run() method
Step 4 : give public access to the run method
Step 5 : Implement the run() method
Step 6 : Create the number of threads
Step 7 : Call the threads (call the start() method)
 */
class Bus_RCOEM extends Thread{
    static int available = 5;
    static int seat = 2;
    Bus_RCOEM(int a){
        seat= a;
    }
    public synchronized void run() {
        String name = Thread.currentThread().getName();
        if(available>=seat){
            System.out.println(name + " ,Seats are booked.");
            available=available-seat;
        }else{
            System.out.println(name +",Sry");
        }

    }
}
public class Main {
    public static void main(String[] args) {
        Bus_RCOEM op = new Bus_RCOEM(2);

        Thread t1 = new Thread(op);
        Thread t2 = new Thread(op);
        Thread t3 = new Thread(op);

        t1.setName("Harsh");
        t2.setName("Aryan");
        t3.setName("Harshvardhan");

        t1.start();
        t2.start();
        t3.start();

    }
}