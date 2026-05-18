class Bus {
    int available = 10;
    void printing(int seat){
        System.out.println("Hello"+Thread.currentThread().getName());
        System.out.println("Hello"+Thread.currentThread().getName());
        System.out.println("Hello"+Thread.currentThread().getName());
        synchronized (this){
            if(available >= seat){
                System.out.println("--------------- seats are booked :"+Thread.currentThread().getName());
                available = available - seat;
                System.out.println("----------- Available"+available);
            }else{
                System.out.println("Sorry"+Thread.currentThread().getName());
            }
        }
        System.out.println("Bye"+Thread.currentThread().getName());
        System.out.println("Bye"+Thread.currentThread().getName());
        System.out.println("Bye"+Thread.currentThread().getName());
    }
}

public class Main extends Thread{
    int seat;
    static  Bus b1;
    public void run(){
        b1.printing(seat);
    }
    public static void main(String[] args){
        b1 = new Bus();

        Main t1 = new Main();
        Main t2 = new Main();

        t1.setName("Harsh");
        t2.setName("Aryan");

        t1.seat = 6;
        t1.seat = 7;

        t1.start();
        t2.start();

    }
}