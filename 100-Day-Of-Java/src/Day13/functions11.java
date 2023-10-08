public class functions11{
    public static void bintoDeci(int n){
        int Pow = 0;
        int decNum = 0;

        while(n>0){
            int lastdigit = n % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2, Pow));

            Pow ++ ;
            n = n/ 10;

            System.out.println("decimal of " + n + " = " + decNum);
        }

    }

    public static void main(String[] args){
        bintoDeci(163);
    }
}


