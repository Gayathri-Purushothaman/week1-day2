package week1.day2;


public class SmartPhone extends Android
{
	public void connectWhatsapp()
	{
		System.out.println("I am SmartPhone extended version of Android,I can connect Whatsapp");
	}
	public static void main(String args[])
	{
		SmartPhone Sp=new SmartPhone();
		Sp.takeVideo();
		Sp.connectWhatsapp();
		Sp.sendMsg();
		Sp.makeCall();
		Sp.saveContact();
	}
}




