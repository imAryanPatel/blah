class reverse{
    static int rev(int n)
    {
        int revs = 0;
        while(n>0){
            revs = revs*10 + n%10;
            n /= 10;
        }
        return revs ;
    }

    public static void main(String[] args) {
        System.out.println("Sum : "+rev(123));
    }
}