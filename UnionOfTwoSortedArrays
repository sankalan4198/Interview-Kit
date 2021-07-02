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
    }
}
