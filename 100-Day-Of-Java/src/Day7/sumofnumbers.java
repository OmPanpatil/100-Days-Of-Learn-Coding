import java.util.*;

public class sumofnumbers{
    /**
     * @param args
     */
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int range = sc.nextInt();
            int number = 1;
            int sum = 0;

            while(number <= range){
                sum = sum + number;
                number++;

            }
            System.out.println(" Sum is : "  +  sum);
        }

    }
}
