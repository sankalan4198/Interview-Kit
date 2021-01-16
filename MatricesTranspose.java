import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and coloums: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int matrix[][]=new int[10][10];
        int transpose[][]=new int[10][10];
        System.out.println("Enter the elemets in matrix: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                matrix[i][j]=sc.nextInt();

            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("The transpose of the matrix is: ");
        for(i=0;i<col;i++)
        {
            for(j=0;j<row;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
