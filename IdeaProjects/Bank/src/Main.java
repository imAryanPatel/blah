class bank extends Thread{
    int bal = 5000;
    int amt ;
    bank(int a ){
        amt = a ;
    }

    public synchronized void run(){
        if(bal >= amt){
            System.out.println(Thread.currentThread().getName()+" Recieved Money");
            bal = bal - amt;
        }
        else {
            System.out.println("Sorry " +Thread.currentThread().getName()+ " Not enough Balance!" );
        }
    }
}

public class Main {
    public static void main(String[] args) {
        bank b = new bank(2000);
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);
        Thread t4 = new Thread(b);
        t1.setName("Aryan");
        t2.setName("harsh");
        t3.setName("Aman");
        t4.setName("barewar");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}