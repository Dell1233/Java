package javaDemo;

public class VariableCall {

    int x;


    public static void main(String[] args) {

        VariableCall a=new VariableCall();
        System.out.println(a.x);
        //x is  non static variable and we are using it in a static method so error will be there.
        // If we will create an object of the class and then we can use it.

    }

}
