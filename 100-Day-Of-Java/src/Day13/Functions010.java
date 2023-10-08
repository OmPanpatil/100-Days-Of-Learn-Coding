public class Functions010{
    /**
     * @param n
     * @return
     */
    public static boolean isprime(int n){
        //corner class

        if(n == 2){
            return true;
        }

        for(int i = 2; i <= n-1; i++){
            if(n%i == 0){
                return false;
            }
        }
        return false;
        
       
    }

    public static void main(String[] args){

        System.out.println(isprime(4));
    }

   
}

