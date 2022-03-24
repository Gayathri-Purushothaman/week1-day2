package week1.day2;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,4,2,3,5,8,9,11,17,12,10};
int i=0;
System.out.println("The odd numbers are as follows");
while(i<=a.length-1)
{
	if(a[i]%2==1)
	{
		System.out.println(a[i]);
	}
	i++;
	
}

	}

}
