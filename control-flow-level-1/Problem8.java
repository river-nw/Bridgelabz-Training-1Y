import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int counter = sc.nextInt();
        int i = counter;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
