public class Main
{
	public static void main(String[] args) {
	    String str1="Good";
	    String str2="Morning";
		System.out.println("Strings before Swapping-- "+str1+" , "+str2);
		//Concatenate two strings to str1
		str1=str1+str2;
		
		//Extract str2
		str2=str1.substring(0,(str1.length()-str2.length()));
		
		//Extract str1
		str1=str1.substring(str2.length());
		
		System.out.println("Strings after Swapping-- "+str1+" , "+str2);
	}
}
