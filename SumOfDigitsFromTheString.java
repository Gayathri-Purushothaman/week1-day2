package week1.day2;

public class SumOfDigitsFromTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="123abc12";
char[] txtarr=new char[text.length()];
int sum=0;
for(int i=0;i<=text.length()-1;i++)
{
	txtarr[i]=text.charAt(i);
	if(Character.isDigit(txtarr[i]))
	{
		sum=sum+Character.getNumericValue(txtarr[i]);
	}
	
}
System.out.println(sum);
	}

}
