import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seats = 5;
        do {
            System.out.print("\nEnter name: ");
            String name;
            name = sc.next();
            System.out.println("Hello " + name + "!");

            System.out.println("Enter the no. of seats : ");
            int se = sc.nextInt();
            if (se <= seats) {
                seats = seats - se;
                System.out.println(+se+" seats booked");

            } else {
                System.out.println("Sorry seats not avilable");
                System.out.println("Only "+seats+" seats are remaning");
            }
        }while(seats>0);
        }
    }
