import java.util.Scanner;
public class Matrix_Add {
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows and coloums: ");
        int row= sc.nextInt();
        int col=sc.nextInt();
        int a[][]=new int[100][100];
        int b[][]=new int[100][100];
        int c[][]=new int[100][100];
        System.out.println("Enter elements for matrix A: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();

            }
        }
        System.out.println("Enter elements for matrix B: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                b[i][j]=sc.nextInt();

            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                c[i][j]=a[i][j]+b[i][j];

            }
        }
        System.out.println("Sum is: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
               System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }



    }
}
