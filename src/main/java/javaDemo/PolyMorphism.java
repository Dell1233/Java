package javaDemo;

public class PolyMorphism {

    //poly-multi forms
    // add()
    //add(int a, int b)
    //add(int a)
    //Method name is same but arg will be different
    //2 types Polymorphism:
    // Overloading,compile time,early binding(before run,methods are binded with values)
    //overriding,runtime poly,late binding

    //Method Overloading::
    //method can be overloading if and only if method has the same name with different signature.
    //signature: type of argument should be different,no of arguments,order of argument

    public static void main(String[] args) {

    }
    public void add(int a,int b)
    {

    }
    public void add (int a,int b,int c) // method same , no of arg diff
    {

    }
    public void add(double a, double b) //method same, type of arg different
    {

    }
    public  void add(int a, double b)  //method same, order of arg diff
    // if the order of arg changed then it will be a separate method

    {
        double sum= a+b;  // upcasting-- converted int into double/internal type casting
                              //converting lower datatype to higher data type.
    }
    public void add(double a, int b) //method same, order of arg different
    {

    }
}
