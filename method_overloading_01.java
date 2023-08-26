package Method_Overloading;

public class method_overloading_01 
{
    void add(int x, int y) //1
    {
        System.out.println(x + y);
    }
    
    void add(double x, double y) //2
    {
        System.out.println(x + y);
    }
    
    void add(int x, int y, int z) //3
    {
       System.out.println(x + y + z);
    }
    
    void add(float x, float y) //4
    {
        System.out.println(x + y);
    }
    
    void add() //5
    {
        System.out.println("Not available");
    }
}
