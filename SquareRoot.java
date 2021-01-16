import java.util.Scanner;
import java.lang.*;
import java.text.DecimalFormat;
public class SquareRoot {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String args[])
    {
        double num,root;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextDouble();
        root=Math.sqrt(num);
        System.out.println("The root is: "+df.format(root));
    }
}
