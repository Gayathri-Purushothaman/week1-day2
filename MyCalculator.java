package week1.day2;
import week1.day2.Calculator;
public class MyCalculator {

	public static void main(String args[])
	{
	Calculator cal=new Calculator();
		int sum=cal.add(23, 21, 45);
		int sub=cal.sub(50, 32);
		double mul=cal.mul(23, 21);
		float div=cal.div(35.4f, 32.3f);
		System.out.println("The addition value" + sum);
		System.out.println("The subtracted value" + sub);
		System.out.println("The multiplied value"+mul);
		System.out.println("The divided value"+div);
		
	}
}
