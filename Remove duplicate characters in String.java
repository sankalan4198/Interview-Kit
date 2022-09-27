import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str="Sankalan is a a good boy";
	    
	    //Create a Linked HashSet of type Character
	    LinkedHashSet<Character> set=new LinkedHashSet<>();
	    
	    //Add each character of string to hash set
	    for(int i=0;i<str.length();i++)
	    {
	        set.add(str.charAt(i));
	    }
	    
	    //Print the string after removing duplicate characters
	     for(Character ch : set)   
            System.out.print(ch);   
		 
	}
}
