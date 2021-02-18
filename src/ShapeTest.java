
public class ShapeTest {

	public static void main(String[] args) {
		
		// programming for interfaces not implementation
		Shape1 shape = new Circle1(10);
		
		Circle1 c=new Circle1(10);
		
		shape.draw();
		
		//System.out.println("Radius= "+ c.getradius());
		System.out.println("Area= "+ shape.getArea());
		
		// switching from one implementation to another easily
		shape= new Rectangle1(10,10);
		shape.draw();
		System.out.println("Area= "+ shape.getArea());
	}

}
