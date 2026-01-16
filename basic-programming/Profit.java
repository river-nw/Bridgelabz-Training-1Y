import java.util.Scanner;

public class Profit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price: ");
        int sp = sc.nextInt();
        int profit = sp - cp;
        int pp = (profit/cp) * 100 ;
        System.out.println("Profit: " + profit);
        System.out.println("Profit percentage: " + pp);
    }
}
