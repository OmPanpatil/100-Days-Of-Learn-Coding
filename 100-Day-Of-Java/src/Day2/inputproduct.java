package Day2;

import java.util.Scanner;

public class inputproduct {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int product = a*b;
            System.out.println(product);
        }
    }
}
