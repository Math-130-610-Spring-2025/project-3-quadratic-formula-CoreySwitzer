import java.util.Scanner;
/** @author Corey Switzer
 *
 *
 */

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This program solves a quadratic equation in standard form");
        System.out.println("a*x^2 + b*x + c = 0");
        System.out.println("Please enter the following: ");

        System.out.print("Quadratic coefficient a: ");
        double a = input.nextDouble();
        System.out.print("Linear coefficient b: ");
        double b = input.nextDouble();
        System.out.print("Constant c: ");
        double c = input.nextDouble();

        if (a == 0) {
            System.out.println("Error: a cannot be zero.");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The quadratic equation has two real solutions:%n");
            System.out.printf("x = %.4f%n", root1);
            System.out.printf("x = %.4f%n", root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("The quadratic equation has one real solution:%n");
            System.out.printf("x = %.4f%n", root);
        } else {
            double RealPart = -b / (2 * a);
            double ImaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("The quadratic equation has two complex solutions:%n");
            System.out.printf("x = %.4f + %.4fi%n", RealPart, ImaginaryPart);
            System.out.printf("x = %.4f - %.4fi%n", RealPart, ImaginaryPart);
        }

        input.close();
    }
}