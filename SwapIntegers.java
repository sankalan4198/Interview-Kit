import java.util.Scanner;
public class Swap {
    public static void main(String[] args)
    {
        int temp;
        Scanner sc=new Scanner((System.in));
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Bfore Swap 1st integer= "+x+" and 2nd integer= "+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swap 1st integer= "+x+" and 2nd integer= "+y);

    }
}
