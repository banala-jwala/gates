package entity;

public class hlo {
	String name="jwala";
	String email="neonetworks@gmail.com";
	String address="anantapur";
	int age=20;
	long mobile=9262778888l;
	char gender='f';
	
	public void display()
	{
	System.out.println("my name="+name);
	 System.out.println("my email="+email);
	 System.out.println("my address="+address);
	 System.out.println("my age="+age);
	 System.out.println("mobilenumber="+mobile);
	 System.out.println("gender="+gender);
	}
	
	
 static class welcome
{
	 public static void main(String args[]) 
	 
	 {
		 hlo a,b;
		 a=new hlo();
		 b=a;
}
}
}
