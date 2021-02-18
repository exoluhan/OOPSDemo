
public class Emp3 {
	
	String name;
	int year;
	String address;  
	
	public Emp3(String n,int yr,String add)
	{
		
		this.name=n;
		this.year=yr;
		this.address= add;
	}
	void display()
	{
		
		System.out.println(name+"    "+year+ "  \t  "+"\t"+ address);
		
	}

	public static void main(String[] args) {
		
		
		
		Emp3 e1= new Emp3("Robert",1994," 64C- WallsStreet");
		Emp3 e2= new Emp3("Sam   ",2000," 68D- WallsStreet");
		Emp3 e3= new Emp3("John  ",1999," 26B- WallsStreet");
		System.out.println("Name\t  "+ "Year of joining\t  "+ "Address");
		e1.display();
		e2.display();
		e3.display();
		

	}

}