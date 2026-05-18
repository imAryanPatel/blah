import java.util.Scanner;
//
//public class Add_the_number {
//    public static void main(String[] args) {
//        System.out.println("Enter the number : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        while(n!=0){
//            int last = n%10;
//            sum += last;
//            n/=10;
//        }
//        System.out.println("The sum is :" +sum);
//    }
//}
class Add_the_number{
    static int digitSum(int n)
    {
        int sum = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum : "+digitSum(123));
    }
    }



