
public class Contact {
	
	void createContact(String name,long num)
	{
		System.out.println("contact info: "+name+num);
	}
	void createContact(String name,long num1,long num2)
	{
		System.out.println("contact info: "+name+num1+" "+num2);
	}

	public static void main(String[] args) {
		
		Contact contact= new Contact();
		contact.createContact("Sam ", 9823110567L);
		contact.createContact("William ",9714503567L,9376797495L);
		

	}

}
