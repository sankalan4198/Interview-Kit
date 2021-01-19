import java.util.Scanner;
public class PythagoreanTriplets {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit= sc.nextInt();
        System.out.println("The triplets are: ");
        pythagoreanTriplet(limit);
    }

    public static void pythagoreanTriplet(int limit)
    {
        int a,b,c=0;
        int m=2;
        int n;

        while(c<limit)
        {
            for(n=1;n<m;n++)
            {
                a=m*m-n*n;
                b=2*m*n;
                c=m*m+n*n;

                if(c>limit)
                    break;
                else if(a==0 || b==0 ||c==0)
                    break;

                System.out.println(a+" "+b+" "+c+" ");
            }
            m++;
        }

    }
}
