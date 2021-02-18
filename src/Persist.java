import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws Exception {
		
		Student3 s1= new Student3(777,"BTS");
		
		FileOutputStream fout=new FileOutputStream("c:/demo/f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		System.out.println("Success");

	}

}
