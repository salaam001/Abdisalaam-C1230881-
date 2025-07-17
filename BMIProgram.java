import java.util.Scanner;

public class BMIProgram {
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.print("Your BMI is:"+bmi);
}
}