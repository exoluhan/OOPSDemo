class Animal
{
	String name;
	public void eat()
	{
		System.out.println("I can eat");
	}
}
class Dog extends Animal // inherit from animal
{
	// new method in subclass
	public void display()
	{
		System.out.println("My name is: "+ name);
	}
}
public class AnimalTest {
	

	public static void main(String[] args) {
		
		//create an object of the subclass
		Dog labrator = new Dog();
		
		//access field of superclass
		labrator.name ="Yeontan";
		labrator.display();
		
		labrator.eat();
		

	}

}
