import java.util.*;
public class functions14 {
    public static void main(String[] args){
        System.out.println("please enter a number :");
        try (Scanner sc = new Scanner (System.in)) {
            int Pallindrome = sc.nextInt();
            if(ispallindrome(Pallindrome)){
                System.out.println("Number : " + Pallindrome + " is a pallindrome ");


            }else{
                System.out.println(" Number : " + Pallindrome + " is not a pallindrome " );
            }
        }


    }
    public static boolean ispallindrome(int number){
        int pallindrome = number;
        int reverse = 0;

        while(pallindrome != 0 ){
            int remainder = pallindrome % 10;
            reverse = reverse * 10 + remainder;
            pallindrome = pallindrome /10;
        }
        if( number == reverse){
            return true;
        }
        else{
            return false;
        }
    }

    
    
}
