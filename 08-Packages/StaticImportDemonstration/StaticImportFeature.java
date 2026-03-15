package StaticImportDemonstration;
import static java.lang.Math.*;
public class StaticImportFeature {
    public void demonstrationOfMethods(){
        int a=5;
        int b=25;
        int c=99;
        int d=250;
        int e=34;
        int f=77;
        int g=-786;
        double r1=sqrt(b);
        double r2=pow(b,a);
        int r3=max(c,d);
        int r4=min(e,f);
        int r5=abs(g);
        System.out.println("Demonstration of sqrt(25) : "+r1);
        System.out.println("Demonstration of pow(25,5) : "+r2);
        System.out.println("Demonstration of max(99,250) : "+r3);
        System.out.println("Demonstration of min(34,77) : "+r4);
        System.out.println("Demonstration of abs(-786) : "+r5);
    }
}
