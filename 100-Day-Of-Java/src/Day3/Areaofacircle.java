package Day3;

import java.util.Scanner;

public class Areaofacircle{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float rad = sc.nextFloat();
            float Areaofacircle = 3.142f * rad * rad;
            System.out.println(Areaofacircle);
        }

    }
}



