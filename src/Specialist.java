
public class Specialist extends Doctor {
	protected String speciality;
	
	Specialist()
	{
		
	}
	Specialist(final String str,final int num,final String addr,final String special)
	{
		super(str,num,addr);
		speciality=special;
	}
	void display()
	{
		super.display(); // call base class method
		System.out.println("the speciality is: "+ speciality);
	}

}

