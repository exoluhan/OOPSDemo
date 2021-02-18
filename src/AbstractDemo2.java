abstract class Shape
{
    String objectName=" ";
    Shape(String name)
    {
        this.objectName=name;
    }
    public void moveTo(int x,int y)
    {
        System.out.println(this.objectName+" "+"has been moved to x="+x+" y="+y);
    }
    abstract public double area();
    abstract public void draw();
}
class Rectangle extends Shape
{
    int length,width;
    Rectangle(int length,int width,String name)
    {
        super(name);
        this.length=length;
        this.width=width;
    }
    public void draw()
    {
        System.out.println("Reactangle has been drawn");
    }
    public double area()
    {
        return(double)(length*width);
    }
}
class Circle extends Shape
{
    double pi=3.14;
    int radius;
    
    Circle(int radius,String name)
    {
        super(name);
        this.radius=radius;
    }
    public void draw()
    {
        System.out.println("Circle has been drawn");
    }
    public double area()
    {
        return (double)((pi*radius*radius)/2);
    }
}

 

public class AbstractDemo2 {

 

    public static void main(String[] args) {
        Shape rect=new Rectangle(2,3,"Rectangle");
        rect.draw();
        System.out.println("Area of Rectangle:"+rect.area());
        rect.moveTo(1, 2);
        System.out.println(" ");
        
        Shape circle=new Circle(2,"Circle");
        circle.draw();
        System.out.println("Area of Circle: "+circle.area());
        circle.moveTo(2, 4);

 

    }

 

}