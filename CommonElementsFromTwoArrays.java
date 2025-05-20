import java.util.Scanner;
public class CommonElementsFromTwoArrays {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,i,j;
        System.out.println("Enter no of elements for Array1: ");
        n1=sc.nextInt();
        System.out.println("Enter no of elements for Array2: ");
        n2=sc.nextInt();
        int arr1[]=new int[100];
        int arr2[]= new int[100];
        System.out.println("Enter the elements from Array1: ");
        for(i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements from Array2: ");
        for(j=0;j<n2;j++)
        {
            arr2[j]=sc.nextInt();
        }

        System.out.println("The common elements from both arrays are: ");
        for(i=0;i<n1;i++)
        {
            for(j=0;j<n1;j++)
            {
                if(arr1[i]==arr2[j])
                    System.out.print(arr1[i]+" ");
            }
        }
        }
    }

-------------------------------------------------

	/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> common=new HashSet<>();
        
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        
        for(int i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
                common.add(arr2[i]);
            }
        }
        
        System.out.print(common);

	}
}


/*Also see if there re redundant data in two one of the arrays and that is common between two arrays, how to remove redundant data
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr1[] = { 1,2,3,4,5};
		int arr2[]={2,5,4,16,54,1,66,4};
		
		List<Integer> list1=new ArrayList<>();
		
		for(int i=0;i<arr1.length;i++)
		{
		    for(int j=0;j<arr2.length;j++)
		    {
		        if(arr1[i]==arr2[j])
		        {
		            list1.add(arr1[i]);
		        }
		    }
		}
	
		Set<Integer> s = new HashSet<Integer>(list1);
		
		 System.out.println(s);  
	}
}*/
