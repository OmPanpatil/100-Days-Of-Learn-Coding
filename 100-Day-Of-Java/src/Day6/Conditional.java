import java.util.*;
public class Conditional{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(" Enter the value of a : ");
            int a = sc.nextInt();
            System.out.print(" Enter the value of b : ");
            int b = sc.nextInt();
            if(a >= b){
                System.out.println(" The value of a is greater than value of b. ");
            }
            else{
                System.out.println(" The Value of b is greater than a. ");
            }
        }
    }
}