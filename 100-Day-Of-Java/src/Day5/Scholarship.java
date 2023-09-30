/** A government wants to provide student loans to student int their country.
 But in order for a student to get elligible to get a student loan,he/she must be in the range 17 to 21,
 and must have a minimum score of 80% score in academics. Write a program to accept name,age,marks of a student 
 and display if he/she is eligible for the loan or not. */

import java.util.*;

public class Scholarship{
    /**
     * @param args
     */
    public static void main(String[] args){
        try (Scanner Sc = new Scanner(System.in))
        {
            System.out.print("Enter your name : ");
            String name = Sc.nextLine();

            System.out.println(" Enter your age : ");
            int age = Sc.nextInt();

            System.out.println(" Enter your marks : ");
            double marks = Sc.nextDouble();

            if((age <= 21 && age >= 17)){
                if(marks >= 80){
                    System.out.println( name+ " student is eligible for studnet loan. ");

                }

                else{
                    System.out.println( name+ " student is not eligible. ");
                }
            }

            else{
                System.out.println(name+ " student is not eligible. ");
            }
        }
           
        
        

    }
}
        