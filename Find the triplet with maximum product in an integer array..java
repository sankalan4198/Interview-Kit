//0(N3)

public class Main
{
	public static void main(String[] args) {
		
	    int arr[]={-4,1,-8,9,6,10,-9};
	    int product=0;
	    int max=0;
	    int a=0,b=0,c=0;
	    
	    for(int i=0;i<arr.length-2;i++)
	    {
	        for(int j=i+1;j<arr.length-1;j++)
	        {
	            for(int k=j+1;k<arr.length;k++)
	            {
	                product=(arr[i]*arr[j]*arr[k]);
	                
	                if(product>max)
	                {
	                    max=product;
	                    a=arr[i];
	                    b=arr[j];
	                    c=arr[k];
	                }
	            }
	        }
	       
	    }
	    System.out.println(max);
	    System.out.println(a+","+b+","+c);
	}
}


----------------------------------------------------


  //0(N2) SOLUTION

  import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	    int arr[]={-4,1,-8,9,6,10,-9};
	    //Max product can be either from 3 largest no OR 2 smallest and largest no
	    Arrays.sort(arr);
	    int n=arr.length;
	    int product1=arr[n-3]*arr[n-2]*arr[n-1];
	    int product2=arr[0]*arr[1]*arr[n-1];
	    
	    if(product1>product2)
	    {
	        System.out.println(arr[n-3]+","+arr[n-2]+","+arr[n-1]);
	    }
	    else{
	        System.out.println(arr[0]+","+arr[1]+","+arr[n-1]);
	    }
	}
}




  

  
