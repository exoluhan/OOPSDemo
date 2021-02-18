class Student200
{
	private int rollno;
	private String name;
	static String college="BMS";
	
	public static void changeCollege()
	{
		college="RVCE";
		// rollno=1; shows error since it is not static variable
	}
	public Student200(int r,String n)
	{
		rollno=r;
		name= n;
	}
	public void disply()
	{
		System.out.println(rollno+ " "+ name+" "+ college);
	}
}
public class TestStaticMethod {

	public static void main(String[] args) {
		
		Student200.changeCollege(); // call static method without creating an object
		
		Student200 s1= new Student200(101,"Rj");
		Student200 s2= new Student200(102,"Jk");
		Student200 s3= new Student200(103,"Jm");
		
		s1.disply();
		s2.disply();
		s3.disply();

	}

}
