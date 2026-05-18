/*class Table extends Thread {
    int a;
    Table(int a) {
        this.a = a;
    }
    public static synchronized void printTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
        System.out.println();
    }

    public void run() {
        printTable(a);
    }
}



public class Main {
    public static void main(String[] args) {

        Table t1 = new Table(5);
        Table t2 = new Table(7);

        t1.start();
        t2.start();
    }
}
*/
class Table{
    synchronized void printTable(int n){
        for(int i =1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+i*n);
        }
    }
}
class Five extends Thread{
    Table F;
    Five(Table f){
        F = f;
    }
    public void run() {
        F.printTable(5);
    }
}
class Seven extends Thread{
    Table S;
    Seven(Table s){
        S = s;
    }
    public void run() {
        S.printTable(7);
    }
}
public class Main{
    public static void main(String[] args) {
        Table op = new Table();

        Five t1 = new Five(op);
        Seven t2 = new Seven(op);

        t1.start();
        t2.start();
    }
}