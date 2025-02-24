public class Car_Singleton 
{
    private static Car_Singleton instance;
    private static int instanceCount = 0;
    private Car_Singleton() 
    {
        instanceCount++;
        System.out.println("Car_Singleton instance created.");
    }
    public static Car_Singleton getInstance() 
    {
        if (instance == null) 
	{
            instance = new Car_Singleton();
        }
        return instance;
    }
    public void drive() 
    {
        System.out.println("The car is driving.");
    }
    public void stop() 
    {
        System.out.println("The car has stopped.");
    }
    public static int getInstanceCount() 
    {
        return instanceCount;
    }
    public static void main(String[] args) 
    {
        Car_Singleton car1 = Car_Singleton.getInstance();
        Car_Singleton car2 = Car_Singleton.getInstance();
        System.out.println("Total Car instances created: " + Car_Singleton.getInstanceCount());
    }
}