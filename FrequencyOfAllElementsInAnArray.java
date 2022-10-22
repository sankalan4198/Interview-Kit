public class Main
{
	public static void main(String[] args) {
	   int arr[]={1,2,3,4,2,2,3,3,3,3,4,5,6};
	   int freq[]=new int[arr.length];
	   
	   int counted=-1;
	   
	   for(int i=0;i<arr.length;i++)
	   {
	       int count=1;
	       for(int j=i+1;j<arr.length;j++)
	       {
	           if(arr[i]==arr[j])
	           {
	               count++;
	               freq[j]=counted;
	           }
	       }
	       if(freq[i]!=counted)
	       {
	           freq[i]=count;
	       }
	   }
	   
	   for(int i=0;i<arr.length;i++)
	   {
	       if(freq[i]!=counted)
	       {
	           System.out.println(arr[i]+"---------------> "+freq[i]);
	       }
	       
	   }
	}
}
