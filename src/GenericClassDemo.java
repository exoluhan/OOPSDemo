class Sample<T> // Generic class
{
	// here T refers to Integer once,String once and Float once
	
	private T data;

	public Sample(T data) {
		super(); // base class constructor
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {  
		this.data = data;
	}
	
	
}
public class GenericClassDemo {

	public static void main(String[] args) {
		
		Sample<Integer> s1= new Sample<Integer>(15); // creating a object of generic class
		//s1.setData(15);
		System.out.println("Display from generic class of type integer: "+s1.getData());
		
		Sample<String> s2= new Sample<String>("Java Generics"); 
		//s2.setData("Java Generic");
		System.out.println("Display from generic class of type integer: "+s2.getData());
		
		Sample<Float> s3= new Sample<Float>(120.35f); 
		//s3.setData(120.35f);
		System.out.println("Display from generic class of type integer: "+s3.getData());

	}

}
