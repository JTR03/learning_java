import java.util.Scanner;

public class debug {
    public static void main(String[] args) {

        System.out.println("Let's calculate the area of a triangle");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the base of the triangle (in inches).");
        double base = input.nextDouble();

        if (base <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            base = input.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in inches).");
        double height = input.nextDouble();
        if (height <= 0) {
            System.out.println("That's invalid. Please input the height of the triangle (in inches).");
            height = input.nextDouble();
        }

        double area = (base * height) / 2;
        System.out.println("The area is " + area);
}
}
