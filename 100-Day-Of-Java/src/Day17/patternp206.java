public class patternp206{
    public static void butterfly(int n){
        // first half

        // outer loop

        int j;
        for( int i =1; i<= n; i++){
            // stars-- i

            for(j=1 ; j<= i; j++){
                System.out.print("*");

            }
            // spaces--- 2*(n-i)

            for( j= 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            // stars -- i

            for( j =1; j<= i; j++){
                System.out.print("*");

            }
            System.out.println();


        }

        // for second half

        // outer loop

        for(int i = n; i>= 1; i-- ){

            // stars -- i

            for(j =1; j<= i; j++){
                System.out.print("*");
            }
            // spaces-- 2*(n-i)

            for(j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            // stars -- i

            for(j =1; j<=i ; j++){
                System.out.print("*");

            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        butterfly(4);
    }
}