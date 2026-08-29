public class Main
{
	public static void main(String[] args) {
		 int arr[] = { 1, -1, -3, -2, 7, 5, 11, 6 };
		 int temp[]=new int[arr.length];
		 int k=0;
		 for(int i=0;i<arr.length;i++)
		 {
		     if(arr[i]>0)
		     {
		         temp[k++]=arr[i];
		     }
		 }
		 
		 for(int i=0;i<arr.length;i++)
		 {
		     if(arr[i]<0)
		     {
		         temp[k++]=arr[i];
		     }
		 }
		 
		 for(k=0;k<arr.length;k++)
		 {
		     System.out.print(temp[k]+" ");
		 }
	}
}
_____________________________________

	without extra space- Two pointers

	public class Main
{
	public static void main(String[] args) {
		int arr[]={1,2,-1,-4,5,-3,6};
		int i=0,j=arr.length-1;
		//Move 
		
		while(i<j)
		{
		    if(arr[i]<0 && arr[j]>0)
		    {
		        int temp=arr[i];
		        arr[i]=arr[j];
		        arr[j]=temp;
		        i++;
		        j--;
		    }
		    else if((arr[i]>0 && arr[j]<0)|| (arr[i]>0 && arr[j]>0))
		    {
		        i++;
		    }
		    else
		    {
		        j--;
		    }
		    
		}
		
		for(i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}

--------------------------------------------------------------

	// Online Java Compiler
// Use this editor to write, compile and run your Java code online
 Simple solution without extra space- 29th Aug 2026
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,-1,4,-2,3};
        int k=arr.length-1;

        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]<0)
            {
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;

                k--;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
