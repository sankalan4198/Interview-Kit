import java.util.Scanner;
import java.util.*;
public class SpiralMatrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m=sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        //ArrayList<Integer> list=new ArrayList<Integer>();
        int i;
        int k=0,l=0;
        int last_row=m-1;
        int last_col=n-1;

        //MATRIX INPUT
        System.out.println("Enter the elements of matrix: ");
        for(i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("The elements of matrix in sprial form are: ");

        while(k<=last_row && l<=last_col)
        {
            for(i=l;i<=last_col;i++)
            {
                System.out.print(matrix[k][i]+" ");
            }
            k++;

            for(i=k;i<=last_row;i++)
            {
                System.out.print(matrix[i][last_col]+" ");
            }
            last_col--;

            if(k<=last_row)
            {
                for(i=last_col;i>=l;i--)
                {
                    System.out.print(matrix[last_row][i]+" ");

                }
                last_row--;
            }
            if(l<=last_col)
            {
                for(i=last_row;i>=k;i--)
                {
                    System.out.print(matrix[i][l]+" ");

                }
                l++;
            }
        }
    }
}
