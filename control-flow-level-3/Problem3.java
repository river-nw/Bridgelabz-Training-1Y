import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter physics marks: ");
        double phy = sc.nextInt();
        System.out.print("Enter chemistry marks: " );
        double che = sc.nextInt();
        System.out.print("Enter maths marks: " );
        double mat = sc.nextInt();
        double per = ((phy + che + mat)/3);
        String gra = "";
        String rem = "";
        if (per >= 80) {
            gra = "A";
            rem = "(Level 4, above agency-normalized standards)";
        } else if (per >= 80 && per <= 79) {
            gra = "B";
            rem = "(Level 3, at agency-normalized standards)";
        } else if (per >= 60 && per <= 69) {
            gra = "C";
            rem = "(Level 2, below, but approaching ";
        } else if (per >= 50 && per <= 59) {
            gra = "D";
            rem = "(Level 1, well below agency-normalized standards)";
        } else if (per >= 40 && per <= 49) {
            gra = "E";
            rem = "(Level 1-, too below agency-normalized standards)";
        } else if (per <= 39) {
            gra = "F";
            rem = "(Remedial standards)";
        }
        System.out.printf("Percentage: %.2f%n", per);
        System.out.println("Grade: " + gra);
        System.out.println("Remarks: " + rem);
    }
}
