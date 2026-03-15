import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fee: " );
        double fee = sc.nextDouble();
        System.out.print("Enter discount percent: " );
        double discountPercent = sc.nextDouble();
        double discount = (discountPercent/100) * fee;
        double price = fee - discount;
        System.out.println("Discount: " + discount);
        System.out.println("Price: " + price);
    }
}
