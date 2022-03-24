package week1.day2;
import java.lang.String;
public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="gayathri";
char[]ch=new char[str.length()];

for(int i=0;i<str.length();i++)
{
	ch[i]=str.charAt(i);
	if(i%2==1)
	{
		//then the index position is odd
		for(int j=0;j<str.length();j++)
		{
			System.out.println("I am located in odd index position "+ i + " the upper case of the character is"+ Character.toUpperCase(str.charAt(i)));
			break;
		}
	}

	else
	{
		System.out.println("I am located in even index position "+i+" the lower case of the character is"+str.charAt(i));
	}
	
}

	}

}
