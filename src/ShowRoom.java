class Car1
{
    //final will make sure engine is initialized
    private final Engine engine;  
    String nameOfCar;
    String modell;
    
    public Car1(String nameOfCar, String model)
    {
       engine  = new Engine("POWERHIGH", "ABC");
       this.nameOfCar = nameOfCar;
       this.modell = model;
    }
    
    public void showAlldetails()
    {
        System.out.println("Name of Car ="+nameOfCar);
        System.out.println("Name of Model ="+modell);
        System.out.println("Engine used in Car ="+engine.typeOfEngine);
        System.out.println("Engine name of Car ="+engine.nameOfEngine);
    }
    
}
class Engine 
{
    String typeOfEngine;
    String nameOfEngine;
    
    Engine(String typeOfEngine, String nameOfEngine)
    {
        this.typeOfEngine = typeOfEngine;
        this.nameOfEngine = nameOfEngine;
    }
}
class ShowRoom
{
    public static void main(String arg[])
    {
        Car1 car = new Car1("BMW", "5X");
        car.showAlldetails();
    }
}