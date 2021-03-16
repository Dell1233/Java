package javaDemo;

public class VariableDemo {
    int x;  //instance variable
            //it can be declared in class but outside the method, constructor and block
            //it has default value: data type: int,byte,short,long=0,float,double=0.0,boolean-false

    public static void main(String[] args)
    {

        int x=0;
        System.out.println(x);

    }
    public void printNames()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("I value is"+i); //i value local variable for for loop
        }
        //System.out.println("I value is"+i);
        //here i value cant be used from for loop because its cant be assessed the local variable for for loop.
    }
    public void marks()
    {
      int marks= 90;
    }
}
