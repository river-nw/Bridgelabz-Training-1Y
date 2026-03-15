import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int greatestFactor = 1;
        if(num>0){
            for (int i = 1; i <= num-1; i++) {
            if (num%i==0){
                greatestFactor = i;
            }
        }
        }
        System.out.println("Greatest factor: " + greatestFactor);
    }
}
