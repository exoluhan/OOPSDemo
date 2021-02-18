import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefined {

	public static void main(String[] args) {
		
		Set<Employee4> empset =new HashSet<Employee4>();
		
		//Set<String> names= new HashSet<String>();
		//Set<Integer> marks=new HashSet<Integer>();
		//names.add("Raj");
		
		Employee4 e1=new Employee4(100,"John",5000);
		Employee4 e2=new Employee4(101,"Mike",7000);
		Employee4 e3=new Employee4(102,"Raj",6000);
		Employee4 e4=new Employee4(103,"John",5000);
		
		empset.add(e1);
		empset.add(e2);
		empset.add(e3);
		empset.add(e4);
		
		for(Employee4 e:empset)
		{
			System.out.println(e.id+" "+ e.name+" "+e.sal);
			
		}
		

	}

}
