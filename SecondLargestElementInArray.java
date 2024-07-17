//Normal Approach - O(N) TC

public class Main
{
	public static void main(String[] args) {
		int arr[]={12,34,1,10,25};
		
		int max=arr[0];
		int min=arr[0];
		int second_max=arr[0];
		int second_min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>max)
		    {
		        max=arr[i];
		    }
		    else if(arr[i]<min)
		    {
		        min=arr[i];
		    }
		}
		for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>second_max &&arr[i]!=max)
        	{
        	    second_max=arr[i];
            }
            else if(arr[i]<second_min && arr[i]!=min)
            {
        		  second_min=arr[i];
        	}
        }
        		
		
		System.out.println(max+" "+min);
		System.out.println(second_max+" "+second_min);
	}
}




//Optimal
public class SecondLargestElementInArray {
    public static void main(String args[])
    {
        int arr[]={12,35,1,10,34,1};
        int i,first,second;

        first=second=Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first)
            {
                second=arr[i];
            }
        }
        if(second== Integer.MIN_VALUE)
        {
            System.out.println("NO 2ND LARGEST ELEMENT");
        }
        else
        {
            System.out.println("The 2nd largest element is: "+second);
        }
    }

}
