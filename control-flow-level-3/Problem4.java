import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num > 0){
            for (int i = 2; i < num; i++) {
                if (num%i==0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("The number " + num + " is a prime number.");
            } else {
                System.out.println("The number " + num + " is NOT a prime number.");
            }
        }

    }
}
