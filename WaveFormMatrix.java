import java.util.Scanner;
import java.util.*;
public class WaveFormMatrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter no of columns: ");
        int col=sc.nextInt();
        int matrix[][]=new int[rows][col];
        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<col;j++)
                {
                    list.add(matrix[i][j]);
                }
            }
            else
            {
                for(int j=col-1;j>=0;j--)
                {
                    list.add(matrix[i][j]);
                }
            }
        }
        System.out.print(list);
    }
}
