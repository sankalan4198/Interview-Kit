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
