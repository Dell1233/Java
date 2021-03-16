package javaDemo;

public class ParameterClass {

    //To make our program dynamic we can pass parameter while calling methods.
    public static void main(String[] args)
    {
        ParameterClass obj1= new ParameterClass();
        double result1=obj1.sub(3456.89, 26.9);
        int result=obj1.add(345,678);
        String fullNme=ParameterClass.getMyFullName("Sambhar", "Pati");
        System.out.println("the sum is"+ result);
        System.out.println("the sub is "+ result1);
        System.out.println("Fullname is"+ fullNme);


    }


    public  static String getMyFullName(String firstName,String lastName)
    {
        String fullName= firstName+"  "+lastName;
        return fullName;
    }
    public int add(int a, int b)
    {

        int c;
        c=a+b;
        //System.out.println("sum is "+c);
        return  c;

        // return keyword will return the value from the method to the main method
        //so return type will be int
    }
    public double sub(double x,double y)
    {
        double z;
        z=x-y;
        //System.out.println("The sub is "+ z);
        return z;
    }

}
