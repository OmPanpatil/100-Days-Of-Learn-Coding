import java.util.*;

public class number2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(" Enter number: ");
            int number = sc.nextInt();
            int n = 1;
            while(n <= number){
                System.out.println(n);
                n++;
            }
        }

    }
}
