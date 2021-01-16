import java.util.Scanner;
public class CountIntegers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n;int count =0 ;
        n=sc.nextLong();
        while(n!=0)
        {
            n/=10;
            count++;
        }
        System.out.println(count);

    }

}
