import java.util.ArrayList;
import java.util.*;
public class UnionOfTwoSortedArrays {
    public static void main(String args[])
    {
        int arr1[]={2, 2, 3, 4, 5};
        int arr2[]={1, 1, 2, 3, 4};

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> newList=new ArrayList<>();

        for(int i=0;i<arr1.length;i++)
        {
            list.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            list.add(arr2[i]);
        }
        for(int i=0;i<list.size();i++)
        {
            if(!newList.contains(list.get(i)))
            {
                newList.add(list.get(i));
            }
        }
        Collections.sort(newList);
        System.out.println(newList);
	    
	    //conver to array
	    Integer arr3[]=new Integer[newList.size()];
        arr3=newList.toArray(arr3);
        
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
        
    }
}


//Better Time complexity

// Java program to find union of
// two sorted arrays

class FindUnion {
	/* Function prints union of arr1[] and arr2[]
	m is the number of elements in arr1[]
	n is the number of elements in arr2[] */
	static int printUnion(int arr1[], int arr2[], int m, int n)
	{
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j])
				System.out.print(arr1[i++] + " ");
			else if (arr2[j] < arr1[i])
				System.out.print(arr2[j++] + " ");
			else {
				System.out.print(arr2[j++] + " ");
				i++;
			}
		}

		/* Print remaining elements of
		the larger array */
		while (i < m)
			System.out.print(arr1[i++] + " ");
		while (j < n)
			System.out.print(arr2[j++] + " ");

		return 0;
	}
// Using Set

	static int printUnion_HashSet(int arr1[], int arr2[], int m, int n)
    {
        HashSet<Integer> set= new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<m;i++)
        {
            set.add(arr1[i]);
        }

        for(int j=0;j<n;j++)
        {
            set.add(arr2[j]);
        }
        for(int it:set)
        {
            list.add(it);
        }
        System.out.println(set);

        return 0;
    }
	public static void main(String args[])
	{
		int arr1[] = { 1, 2, 4, 5, 6 };
		int arr2[] = { 2, 3, 5, 7 };
		int m = arr1.length;
		int n = arr2.length;
		printUnion(arr1, arr2, m, n);
	}
}
