package javaDemo;

public class ChildClass extends  Inheritance { //inheritance

    public static void main(String[] args) {

        ChildClass obj1= new ChildClass(); //1
        Inheritance obj2=  new Inheritance();// 2 --parent class obj, only access the parent class methods
        obj2.add();//only add and sub ----- parent class methods
        obj2.sub();//parent class methods
        Inheritance obj3= new ChildClass(); //3 only base class methods
        obj1.div();
        obj1.add();
        obj1.sub();
        obj1.mul();

    }  // scenario 1:: child class reference and child class object-
    // This will  allow to access all the methods of base class and child class
    //Scenario 2:: Base class reference and Base class object -
    // this will allow to access all the methods of the base class only
    //Scenario 3: Base class reference and child class obj-
    //This will allow to access only base class methods of base class and not child class method
    public  void mul()
    {
        System.out.println("The multiplication is 20");
    }

    public void div()
    {
        System.out.println("The division is 40");
    }
}
