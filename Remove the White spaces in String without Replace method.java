import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		String str="g eeks for ge eeks ";
		char str_arr[]=str.toCharArray();
		
		int count =0;
		
		for(int i=0;i<str_arr.length;i++)
		{
		    if(str_arr[i]!=' ')
		    {
		        str_arr[count++]=str_arr[i];
		    }
		}
		
		//Printing the array
		for(int i=0;i<str_arr.length;i++)
		{
		    System.out.print(str_arr[i]);
		}
		//To return the result as a string, conver the array to string
		String str1=new String(str_arr);
		System.out.println(str1);
	}
}
