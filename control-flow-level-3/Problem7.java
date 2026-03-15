import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (in kg): ");
        double wkg = sc.nextInt();
        System.out.print("Enter height (in cm): ");
        double hcm = sc.nextInt();
        double htm = hcm/100.0;
        double bmi = wkg / (htm * htm);
        System.out.printf("BMI: %.2f%n", bmi);
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else if (bmi >= 40.0) {
            System.out.println("Status: Obese");
        }
    }    
}
