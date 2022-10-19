import java.util.Scanner;
public class Factorial {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,fact=1;
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        if(n==0)
        {
            System.out.println("Factorial is :1");
            return;
        }
        else {
            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        System.out.println("Factorial is :"+fact);

    }
}
