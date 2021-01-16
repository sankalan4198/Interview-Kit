import java.util.*;
public class QuadraticEquationRoot {
    public static void main(String args[])
    {
        double a,b,c,disc,root1,root2,realPart,imgPart;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter coefficients a,b & c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        disc= (b*b)-(4*a*c);

        if(disc>0)
        {
            root1= (-b + Math.sqrt(disc))/(2*a);
            root2= (-b - Math.sqrt(disc))/(2*a);
            System.out.println("root1 is= %.2f"+root1+ "and root2= %.2f"+root2);
        }
        else if(disc==0)
        {
            root1=root2=-b/(2*a);
            System.out.println("Root1=Root2= "+root1);
        }
        else
        {
            realPart= -b/(2*a);
            imgPart= Math.sqrt(-disc)/(2*a);
        }
    }
}
