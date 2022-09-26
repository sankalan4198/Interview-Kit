public class Main
{
	public static void main(String[] args) {
		String str="Big black bug bit a big black dog on his big black nose";
		String arr[]=str.split(" ");
		int count;
		
		for(int i=0;i<arr.length;i++)
		{
		    count=0;
		    for(int j=i+1; j<arr.length;j++)
		    {
		        if(arr[i].equals(arr[j]))
		        {
		            count++;
		            //Set arr[j] to "0" to avoid printing visited word
		            arr[j]="0";
		        }   
		    }
		   if(count >0 && arr[i]!="0")
    		{
    		    System.out.println(arr[i]);
    		}

		}
		
    }
}
