
public class Circle1 implements Shape1 {
	private double radius;
	public Circle1(double radius)
	{
		super();
		this.radius=radius;
	
}
	@Override
	public void draw() {
		System.out.println("Drawing circle");
		

	}

	@Override
	public double getArea() {
		
		return Math.PI*this.radius*this.radius;
	}

}
