//Constructors in Java 
package Constructors;
 
public class constructor 
{
    String name, gender;
    int age;
  
    constructor() //default constructor
    {
        System.out.println("Null");
    }
    
    constructor(String Name, String Gender, int Age) //parameterized constructor
    {
        name = Name;
        gender = Gender;
        age = Age;
    }
    
    void cons_02()
    {
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println(" ");
    }
    
    public static void main(String[] args) 
    {
        constructor person_01 = new constructor("Tushar", "Male", 22); //object creation & vlaue initialization
        person_01.cons_02();
        
        constructor person_02 = new constructor("John","Male",24); //object creation & vlaue initialization
        person_02.cons_02();
        
        constructor person_03 = new constructor();
        person_03.cons_02();
    }
}



