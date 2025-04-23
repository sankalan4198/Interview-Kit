/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int row=3;
		int col=3;
		
		int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
		int rotated[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        rotated[j][col-i-1]=matrix[i][j];
		    }
		}
		
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        System.out.print(rotated[i][j]);
		    }
		    System.out.println();
		}
	}
}
