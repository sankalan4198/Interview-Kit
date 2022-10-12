import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		String str1="Race";
		String str2="Care";
		
		int n1=str1.length();
		int n2=str2.length();
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		
		//Sorting the Array 
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(n1!=n2)
		{
		    System.out.println("String are not anagram");
		    System.exit(0);
		}
		else
		{
		    if(Arrays.equals(charArray1, charArray2))
		    {
		        System.out.println("Strings are anagram");
		    }
		    else
		    {
		        System.out.println("Strings are not anagram");
		    }
		}
	}
}
