import java.util.Scanner;

public class Sam {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Marks in Math: ");
        int math = sc.nextInt();
        System.out.print("Marks in Physics: ");
        int phy = sc.nextInt();
        System.out.print("Marks in Chemistry: ");
        int chem = sc.nextInt();
        int avg = (math + phy + chem)/3;
        System.out.println("Average: " + avg);
    }
}
