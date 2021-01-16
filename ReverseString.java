import java.util.Scanner;
public class ReverseString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine();
        int n=str.length();
        System.out.println("The reversed string is: ");
        for(int i=n-1; i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}
