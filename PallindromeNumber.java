import java.util.Scanner;
public class PallindromeNumber {
    public static void main(String args[])
    {
        int n, reverse=0,remainder,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            remainder=n%10;
            reverse=reverse*10 +remainder;
            n=n/10;
        }
        if(temp==reverse)
        {
            System.out.println(temp+" is a pallindrome number");
        }
        else
        {
            System.out.println(temp+" is not a pallindrome number");

        }

    }
}
