import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedDemo {

	public static void main(String[] args) {
		
		Employee11 e= new Employee11();
		e.name="BTS";
		e.address="KOREA";
		e.SSN=11122233;
		e.number=777;
		try
		{
			FileOutputStream fileOut = new FileOutputStream("c:/demo/employee11.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in c:/demo/employee11.ser");
			
		}
		catch(IOException i) {
			i.printStackTrace();
		}
	}

}
