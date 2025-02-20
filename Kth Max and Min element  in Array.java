import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int arr[]={1,4,2,3,7,6};
		System.out.println(arr.length);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of k: ");
		int k=sc.nextInt();
		/*Find the Kth Max and Min element in array. This code is mainly done
		with help of Priority queue but we 'll be doing it in a normal basic method*/
		
		//Sorting the array
		Arrays.sort(arr);
		
		//For Kth minimum element
		System.out.println("The Kth minimum element is: "+arr[k-1]);
		
		//For Kth maximum element
		//If arr length is even
		if(arr.length%2==0)
		{
		    System.out.println("The Kth maximum element is "+arr[k]);
		}
		else
		//If arr.length is odd
		{
		    System.out.println("The Kth maximum element is "+arr[arr.length-k]);
		}
	}
}
