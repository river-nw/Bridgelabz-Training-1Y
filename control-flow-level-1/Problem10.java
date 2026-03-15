import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        double total = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double input = sc.nextDouble();
        while(input != 0){
            total += input;
            System.out.println("Total: " + total);
            System.out.print("Enter number: ");
            input = sc.nextDouble();
        }
        System.out.println("Final Total: " + total);
    }
}
