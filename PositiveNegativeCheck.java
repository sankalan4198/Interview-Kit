import java.util.Scanner;
public class PositiveNegative {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n= sc.nextDouble();
        if(n>0)
        {
            System.out.println("Postive");
        }
        else if(n<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("0 is neither positive nor negative");
        }

    }

}
