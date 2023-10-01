import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner heightObj = new Scanner(System.in);
        System.out.print("Enter height (cm): ");
        double height = heightObj.nextDouble();
        System.out.println("Height entered is: " + height + " cm");

        Scanner weightObj = new Scanner(System.in);
        System.out.print("Enter units for weight (kg): ");
        double weight = weightObj.nextDouble();
        System.out.println("Weight length entered is: " + weight + " kg");

        Scanner waistObj = new Scanner(System.in);
        System.out.print("Enter units for waist measurement (cm): ");
        double waist = waistObj.nextDouble();
        System.out.println("Waist length entered is: " + waist + " cm");

        Scanner chestObj = new Scanner(System.in);
        System.out.print("Enter units for chest measurement (cm): ");
        double chest = chestObj.nextDouble();
        System.out.println("Chest length entered is: " + chest + " cm");

        Model testModel = new Model(height, weight, waist, chest);

        System.out.println(testModel.calculateMeasurements());
    }
}