import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int[] arr = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]!=0)
		    {
		        arr[k++]=arr[i];
		    }
		}
		
		for(int i=k;i<arr.length;i++)
		{
		    arr[k++]=0;
		}
		System.out.println(Arrays.toString(arr));
	}
}
