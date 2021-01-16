import java.util.Scanner;
public class Quotient_Rem {
    public static void main(String args[])
    {
        int divd, rem,quot,div;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter dividend: ");
        divd=sc.nextInt();
        System.out.println("Enter divisor: ");
        div=sc.nextInt();

        quot=divd/div;
        rem=divd % div;

        System.out.println("Quotent= "+quot);
        System.out.println("Remainder= "+rem);
    }
}
