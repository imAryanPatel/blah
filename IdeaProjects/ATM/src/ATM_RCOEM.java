import java.util.*;
import java.text.*;
class Account_RCOEM{
    DecimalFormat df1 = new DecimalFormat("###,##0.00' Rupee'");
    DecimalFormat df2 = new DecimalFormat("###,##0.00' Dollar'");
    Scanner sc = new Scanner(System.in);
    private int CN;
    private int pn;
    double CB = 2000;
    double SB = 1000;
    void setCustomerNumber(int cn){
        CN = cn;
    }
    void setPINNumber(int pn){
        this.pn = pn;
    }
    int getCustomerNumber(){
        return CN;
    }
    int getPINNumber(){
        return pn;
    }
    void getCurrentBalance(){
        System.out.println("\nCurrent Account Balance : "+df1.format(CB)+"\n");
    }
    void getSavingBalance(){
        System.out.println("\nSaving Account Balance : "+df2.format(SB)+"\n");
    }
    void getCurrentWithdrawInput(){
        System.out.println("\nCurrent Account Balance : "+df1.format(CB)+"\n");
        System.out.println("Enter Withdraw Amount : ");
        double amt = sc.nextDouble();
        if((CB-amt)>=0){
            System.out.println("\nTransaction Successfull");
            calcCurrentWithdraw(amt);
            System.out.println("New balance is :"+CB);
        }
        else{
            System.out.println("\nInsufficient Balance");
        }
    }
    void getSavingWithdrawInput(){
        System.out.println("\nSaving Account Balance : "+df2.format(SB)+"\n");
        System.out.println("Enter Withdraw Amount : ");
        double amt = sc.nextDouble();
        if((CB-amt)>=0){
            System.out.println("\nTransaction Successfull");
            calcSavingWithdraw(amt);
            System.out.println("New balance is :"+CB);
        }
        else{
            System.out.println("\nInsufficient Balance");
        }
    }
    double calcCurrentWithdraw(double amt){
        CB = CB-amt;
        return CB;
    }
    double calcSavingWithdraw(double amt){
        CB = CB-amt;
        return CB;
    }
}
class OptionMenu_RCOEM extends Account_RCOEM{
    Scanner sc = new Scanner(System.in);
    java.util.HashMap<java.lang.Integer, java.lang.Integer> data = new java.util.HashMap();
    void getLogin(){
        do{
            try{
                data.put(11111,11);
                data.put(11112,12);
                data.put(11113,13);
                data.put(11114,14);
                data.put(11115,14);

                System.out.println("welcome👏");

                System.out.print("\nEnter the customer no. : ");
                setCustomerNumber(sc.nextInt());

                System.out.print("\nEnter the PIN no.      : ");
                setPINNumber(sc.nextInt());
                int P = getCustomerNumber();
                int Q = getPINNumber();
                if(data.containsKey(P) && data.get(P) == Q)
                {
                    getAccountType();
                }
                else{
                    System.out.println("\n Invaild Customer No. or PIN");

                }
            }
            catch(InputMismatchException ime){
                System.err.println("Enter Only Numbers. ");
                System.err.println("Characters & Symbols are not allowed ");
                sc.next();
                getLogin();
            }
        }
        while(true);
    }
    void getAccountType(){
        System.out.println("\nSelect Account Type");
        System.out.println("\nType1 : Current Account");
        System.out.println("Type2 : Saving Account");
        System.out.println("Type3 : Exit");
        System.out.print("\nChoice : ");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                getCurrent();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("\n Thank U for VISITING");
                break;
            default:
                System.out.println("\nInvalid Choice.");
                System.out.println("Enter Valid Choice");
                getAccountType();
                break;
        }
        }
    void getCurrent(){
            System.out.println("\nCurrent Account");
            System.out.println("Type1 : Balance Enquiry");
            System.out.println("Type2 : Withdraw Money");
            System.out.println("Type3 : Deposite Money");
            System.out.println("Type4 : Exit");
            System.out.print("\nChoice : ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    getCurrentBalance();
                    getAccountType();
                    break;
                case 2:
                    getCurrentWithdrawInput();
                    getAccountType();
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("\n Thank U for VISITING");
                    break;
                default:
                    System.out.println("\nInvalid Choice.");
                    System.out.println("Enter Valid Choice");
                    getCurrent();
                    break;
            }
        }
    void getSaving(){
            System.out.println("\nSaving Account");
            System.out.println("\nType1 : Balance Enquiry");
            System.out.println("\nType2 : Withdraw Money");
            System.out.println("\nType3 : Deposite Money");
            System.out.println("Type4 : Exit");
            System.out.print("\nChoice : ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    getSavingBalance();
                    getAccountType();
                    break;
                case 2:
                    getSavingWithdrawInput();
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("\n Thank U for VISITING");
                    break;
                default:
                    System.out.println("\nInvalid Choice.");
                    System.out.println("Enter Valid Choice");
                    getSaving();
                    break;
            }
        }
    }

public class ATM_RCOEM extends OptionMenu_RCOEM{
    public static void main(String[] args) {
        OptionMenu_RCOEM op = new OptionMenu_RCOEM();
        op.getLogin();

    }
}