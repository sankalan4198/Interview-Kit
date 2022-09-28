public class Main
{
	public static void main(String[] args) {
		String str="Sankalan";
		int i;
		
		int freq[]=new int[256];
		for(i=0;i<str.length();i++)
		{
		    freq[(int)str.charAt(i)]++;
		}
		
		for(i=0;i<256;i++)
		{
		    if(freq[i]==1)
		    {
		        //Breaking after printing the first Unique character, ensuring only the first unique character is printed
		        System.out.println((char)i);
		        break;
		    }
		}
	}
}
