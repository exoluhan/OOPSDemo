
public class Complex {
	double real;
	double imaginary;
	
	public Complex(double r, double i)
	{
		real=r;
		imaginary =i;
	}
	void add(Complex obj2)
	{
		this.real += obj2.real;
		this.imaginary += obj2.imaginary;
		// obj3 = obj1 + obj2 (instead of using 3rd variable, we are using this)
	}
	void display()
	{
		System.out.println(this.real + "+i" + this.imaginary);
	}

	public static void main(String[] args) {
		
		Complex obj1 = new Complex(10.3,67.4);
		Complex obj2 = new Complex(0.7,3.6);
		
		obj1.add(obj2); // object passed as an argument
		System.out.println("The addition of the complex nos is: ");
		obj1.display();
		
	}

}
