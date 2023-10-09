import java.util.*;
public class functions12{
    public static double average(double x, double y, double z){
        return (x+y+z)/3;

    }
    /**
     * @param args
     */
    public static void main(String[] args){
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print(" input the first number : ");
            double x = Sc.nextDouble();
            System.out.print(" input the second number : ");
            double y = Sc.nextDouble();
            System.out.print(" input the Third number : ");
            double z = Sc.nextDouble();
            System.out.print(" The average value is : " + average(x,y,z) + "\n");
        }
    }

}