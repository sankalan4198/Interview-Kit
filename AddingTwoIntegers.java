import java.util.Scanner;
public class AddTwoIntegers {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= a+b;
        System.out.println(a+"+"+b+"="+c);
    }

}
