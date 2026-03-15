import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ages of friend A: ");
        int age1 = sc.nextInt();
        System.out.print("Enter ages of friend B: ");
        int age2 = sc.nextInt();
        System.out.print("Enter ages of friend C: ");
        int age3 = sc.nextInt();

        System.out.print("Enter height of friend A: ");
        int height1 = sc.nextInt();
        System.out.print("Enter height of friend B: ");
        int height2 = sc.nextInt();
        System.out.print("Enter height of friend C: ");
        int height3 = sc.nextInt();

        if ((age1 > age2) && (age1 > age3)){
            System.out.println("Friend A is the eldest.");
        } else if ((age2 > age1) && (age2 > age3)){
            System.out.println("Friend B is the eldest.");
        } else if ((age3 > age1) && (age3 > age2)){
            System.out.println("Friend C is the eldest.");
        }

        if ((height1 > height2) && (height1 > height3)){
            System.out.println("Friend A is the tallest.");
        } else if ((height2 > height1) && (height2 > height3)){
            System.out.println("Friend B is the eldest.");
        } else if ((height3 > height1) && (height3 > height2)){
            System.out.println("Friend C is the eldest.");
        }
    }
}
