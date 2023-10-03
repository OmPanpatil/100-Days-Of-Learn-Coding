import java.util.*;
public class Loops3{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(" Enter the number : ");
            int sum = sc.nextInt();
            while(true){
                sum +=  sc.nextInt();
                sum++;
                if( sum > 100 )
                break;
            }
            System.out.println( " Done " + sum );
        }

        
    }
}