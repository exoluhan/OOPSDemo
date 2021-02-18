import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args)throws Exception {
		
		ObjectInputStream in =new ObjectInputStream(new FileInputStream("c:/demo/f.txt"));
		Student3 s=(Student3)in.readObject();
		System.out.println(s.id+" "+s.name);
		
		in.close();
		

	}

}
