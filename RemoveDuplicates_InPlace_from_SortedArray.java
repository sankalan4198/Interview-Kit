import java.util.HashSet;

public class RemoveDuplicates_InPlace_from_SortedArray {
    public static void main(String args[])
    {
        int arr[]={1,1,2,2,2,3,3};
        //removeDuplicates_bruteForce(arr);
        System.out.println("BruteForce Approach--");
        int k=removeDuplicates_bruteForce(arr);
        for(int i=0;i<k;i++)
        {
            System.out.print(arr[i]+" ");

        }
        int arr1[]={1,1,2,2,2,3,3};
        System.out.println("Optimal Approach--");
        int m=removeDuplicates_Optimal(arr1);
        for(int i=0;i<m;i++)
        {
            System.out.print(arr1[i]+" ");
        }

    }

    //BruteForce- by creating a set
    /*Time complexity: O(n*log(n))+O(n)---set insertion takes n*log(n)
    Space Complexity: O(n)*/

    static int removeDuplicates_bruteForce(int arr[])
    {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int k=set.size();
        //moving the pointer of set
        int j=0;
        for(int x: set)
        {
            arr[j++]=x;
        }

        return k;
    }

    //Optimal approach- Two pointer method
    static  int removeDuplicates_Optimal(int arr[])
    {
        int i=0;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
