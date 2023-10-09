

import java.util.*;

public class functions13 {
    public static void main(String[] args){
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print(" Enter an integer : ");
            int num = Sc.nextInt();
            if(isEven (num)){
                System.out.println(" Number is Even.");
            }else{
                System.out.println(" Number is Odd. ");

            }
        }


    }

    public static boolean isEven(int number){
        if(number%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
}
