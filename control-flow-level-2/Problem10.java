import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int greatestFactor = 1;
        int i = 1;
        if(num>0){
            while (i <= num-1) {
            if (num%i==0){
                greatestFactor = i;
            }
            i++;
        }
        }
        System.out.println("Greatest factor: " + greatestFactor);
    }
}
