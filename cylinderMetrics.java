import java.util.Scanner;
public class cylinderMetrics {
    public static void main (String args[]){

        Scanner input = new Scanner( System.in );
        System.out.println("What is the height of the cylinder? ");
        double height = input.nextDouble();
        System.out.println("What is the radius of the cylinder? ");
        double radius = input.nextDouble();

        double radiusHeight = radius * height;
        double PIradiusHeight = Math.PI * radiusHeight;
        double SurfaceArea = PIradiusHeight * 2;
        double radiusSquared = radius * radius;
        double PIradiusSquared = Math.PI * radiusSquared;
        double volume = PIradiusSquared * height;

        System.out.println("For a cylinder with radius of " + radius + ", a height of " + height +
                "\n Surface Area = " + SurfaceArea +
                "\n Volume = " + volume);


    }

}
