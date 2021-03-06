import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialized {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Employee11 e=null;
		try
		{
			FileInputStream fileIn= new FileInputStream("c:/demo/employee11.ser");
    		ObjectInputStream in =new ObjectInputStream(fileIn);
    		e= (Employee11) in.readObject();
    		in.close();
    		fileIn.close();
		}
		catch(IOException c)
		{
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		 catch(ClassNotFoundException c)
        {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
		System.out.println("Deserialized Employee...");
		System.out.println("Name: "+ e.name);
		System.out.println("Address: "+ e.address);
		System.out.println("SSN: "+ e.SSN);
		System.out.println("Number: "+ e.number);
		

	}

}
