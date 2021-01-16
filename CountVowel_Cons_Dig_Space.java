import java.util.Scanner;
public class CountVowel_Cons_Dig_Space {
    public static void main(String args[])
    {
        String line;
        int i,vowel=0,cons=0,digit=0,space=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line: ");
        line=sc.nextLine();
        for(i=0;line.charAt(i)!=0;i++)
        {
            if(line.charAt(i)=='A'||line.charAt(i)=='E'||line.charAt(i)=='I'||line.charAt(i)=='O'||line.charAt(i)=='U'||line.charAt(i)=='a'||line.charAt(i)=='e'||line.charAt(i)=='i'||line.charAt(i)=='o'||line.charAt(i)=='u')
            {
                vowel=vowel+1;
            }
            else if((line.charAt(i)>='a' && line.charAt(i)<='z')||(line.charAt(i)>='A' && line.charAt(i)<='Z'))
            {
                cons=cons+1;
            }
            else if(line.charAt(i)>='0' && line.charAt(i)<='9')
            {
                digit=digit+1;
            }


        }
        System.out.println("Vowels: "+vowel);
        System.out.println("Consonants: "+cons);
        System.out.println("Digits: "+digit);

    }
}
