import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int count = 0;
        if (num >= 0) {
            if (num == 0) {
                System.out.println("Total digit(s): 0");
            } else {
                while (num != 0) {
                    num = num/10;
                    count++;
                }
                System.out.println("Total digit(s): " + count);
            }
        }
    }    
}
