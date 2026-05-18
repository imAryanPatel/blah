
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int  mark[] = new int[5];
        String s1;
        int total=0,per,l=0,m=0;
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Enter no.of students :");
        t = sc.nextInt();
        String name[] = new String[5];
        int totalmark[] = new int[5];
        int percent[] = new int[5];

        for(int i=0;i<t;i++){
            System.out.println("Enter name of student "+i+ " :");
            name[i] = sc.next();
            System.out.println("Enter marks of student "+i+ " :");
            for (int k = 0; k < 5; k++) {
                mark[k] = sc.nextInt();
            }
            for (int j= 0; j < 5; j++) {
                total += mark[j];
            }


        }
        for(int i = 0 ;i<t;i++ ){
            System.out.println("Name " + name[i]);
            for (int k = 0; k < 1; k++) {
                total +=  mark[k];
                System.out.println("Total :" + total);
                per = total/(500/100);
                System.out.println("Percent : "+per );
            }
        }
    }

}