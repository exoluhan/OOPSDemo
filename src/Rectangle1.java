public class Rectangle1 implements Shape1 {
    private double width;
    private double height;
    
    
    public Rectangle1(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

 

    @Override
    public void draw() {
        System.out.println("Drawing Ractangle");

 

    }

 

    @Override
    public double getArea() {
        
        return this.height*this.width;
    }

 

}
 
