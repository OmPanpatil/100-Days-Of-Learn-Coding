/** Check if the nth power of a number is even or not. Take the insput as power and number as input */

import java.util.*;

public class number {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println(" Enter the number: ");
            int number = Sc.nextInt();
            System.out.println(" Enter the power number:  ");
            int n = Sc.nextInt();

            double result = Math.pow(number,n);
            if(result%2 == 0){
                System.out.println(" Result is even!! ");

            }
            else{
                System.out.println(" Result is ODD!! ");
            }
        }


    
    }
}

