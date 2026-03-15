import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        double total = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double input = sc.nextDouble();
        total += input;
        System.out.println("Total: " + total);
        while (true) {
            System.out.print("Enter number: ");
            input = sc.nextDouble();
            if (input > 1){
                total += input;
                System.out.println("Total: " + total);
            } else {
                break;
            }
        }
        System.out.println("Final Total: " + total);
    }
}
