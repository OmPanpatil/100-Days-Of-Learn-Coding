import java.util.*;
public class Tables {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(" Enter number : ");
            int number = sc.nextInt();
            for( int i = 0; i <= 10; i++){
                System.out.println( number + " x " + i + "=" + (number*i));
            }
        }


        
    }
}
