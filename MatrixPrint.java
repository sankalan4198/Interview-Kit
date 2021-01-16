import java.util.Scanner;
public class MatrixPrint {
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows and coloums: ");
        int row= sc.nextInt();
        int col=sc.nextInt();
        int matrix[][]= new int[row][col];
        System.out.println("Enter matrix: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                matrix[i][j]=sc.nextInt();
                System.out.println(" ");
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {

                System.out.println(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
