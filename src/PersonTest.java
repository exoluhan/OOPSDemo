
public class PersonTest {

	public static void main(String[] args) {
		
		Person objPerson= new Person();  // invoke default constructor
		Person objPerson1= new Person("Harshita", 23); // invokes parameterized constructor 
		Person objPerson2= new Person("luhan", 33, "china");
		
		objPerson.input();
		objPerson.print();
		
		objPerson1.print();
		objPerson2.print();

	}

}
