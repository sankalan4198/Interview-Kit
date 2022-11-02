
public class Main
{
	public static void main(String[] args) {
		int arr1[]={1,2,3,4};
		int arr2[]={3,4,5,6,7,8};
		int i=0,j=0,k=0;
		int arr3[]=new int[arr1.length+arr2.length];
		
		while(i<arr1.length && j<arr2.length)
		{
		    if(arr1[i]<arr2[j])
		    {
		        arr3[k++]=arr1[i++];
		    }
		    else
		    {
		        arr3[k++]=arr2[j++];
		    }
		}
		
		while(i<arr1.length)
		{
		    arr3[k++]=arr1[i++];
		}
		
		while(j<arr2.length)
		{
		    arr3[k++]=arr2[j++];
		}
		
		//Merged array 
		for( i=0;i<arr3.length;i++)
		{
		    System.out.print(arr3[i]+" ");
		}
	}
}
