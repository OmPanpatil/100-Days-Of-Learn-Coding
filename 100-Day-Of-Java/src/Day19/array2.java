import java.util.*;
public class array2{
    public static void main(String[] args){
        int number[] = new int [100];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(" ENter your first number : ");
            number[0] = sc.nextInt();
            System.out.print(" Enter your second number : ");
            number[1] = sc.nextInt();
            System.out.print(" Enter your third number :");
            number[2] = sc.nextInt();
        }
        System.out.println(" Your first number is : " + number[0]);
        System.out.println(" Your second number is : " + number[1]);
        System.out.println(" Your third number is : " + number[2]);
    }
}