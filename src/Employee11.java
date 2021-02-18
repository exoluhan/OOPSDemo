import java.io.Serializable;

public class Employee11 implements Serializable {
	
	public String name;
	public String address;
	public transient int SSN; // if not transient then it would print SSN no. in deserializedDemo
	public int number;
	
	public void mailCheck()
	{
		System.out.println("Mailing a check to "+name+" "+address);
	}

}
