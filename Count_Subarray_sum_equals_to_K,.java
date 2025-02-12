/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int arr[]={3,1,2,4};
		int k=6;
		int cnt=0;
		
		for(int i=0;i<arr.length;i++)
		{
		    int sum=0;
		    for(int j=i;j<arr.length;j++)
		    {
		        sum=sum+arr[j];
		        
		        if(sum==k)
		        {
		            cnt++;
		        }
		    }
		}
		System.out.println(cnt);
	}
}
