import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str="Big black bug bit a big black dog on his big black nose";
		str=str.toLowerCase();
		String arr[]=str.split(" ");
		
		//Convert arr to ArrayList
		List list1=Arrays.asList(arr);
		
		System.out.println(list1);
		
		ArrayList<String> list2=new ArrayList<String>();
		
		for(int i=0;i<list1.size();i++)
		{
		    if(!list2.contains(list1.get(i)))
		    {
		        list2.add((String)list1.get(i));
		    }
		}
		
		System.out.println(list2);
		
		//Coversion from ArrayList to String
		String listString = String.join(" ", list2);
		System.out.println(listString);
		
		
		
    }
}
