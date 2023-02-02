import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int arr[]={1,2,4,5,6,7};
		//Binary search only happens in Sorted aray
		int ele =2;
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		
		while(start<=end)
		{
		    if(arr[mid]==ele)
		    {
		        System.out.println(mid);
		        break;
		        
		    }
		    else if(ele<arr[mid])
		    {
		        end=mid-1;
		    }
		    else
		    {
		        start=mid+1;
		    }
		    mid=(start+end)/2;
		}
	}
}
