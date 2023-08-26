package Method_Overloading;

public class method_overloading_01_test 
{
    public static void main(String[] args) 
    {
        method_overloading_01 obj = new method_overloading_01();
        obj.add(2, 4); //1
        obj.add(2.5, 4.5); //2
        obj.add(2, 4, 6); //3
        obj.add(2.5, 4.5); //4
        obj.add(); //5
         
        
    }
}
