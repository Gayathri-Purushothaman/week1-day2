package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input= 1;
int calculated=0,remainder;
int original;
original=input;
while(input>0)
{
	
	remainder=input%10;
	
	calculated=calculated+remainder*remainder*remainder;
	input=input/10;
}
	if(original==calculated)
	{
		System.out.println("Armstrong number"+original);
	}
	else
	{
		System.out.println("Not Armstrong number"+original);
	}

	



	}

}
