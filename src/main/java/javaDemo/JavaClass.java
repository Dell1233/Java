package javaDemo;

public class JavaClass {  //static method  can be called  using Classname directly with (.) operator
                          //non static method can be called through Object using (.)operator
                          //local variable which will be declared in a method,constructor or blocks

      int x=12;
      int y=30;//global variable/instance variable

    public static void main(String[] args)
    {
        System.out.println("program started");
        JavaClass obj= new JavaClass();
        obj.sum();
        System.out.println("program ended");
        System.out.println("x value is"+obj.x); // we can call the global variable directly or through the object also.
        System.out.println("y value is"+obj.y);
        //int x = 0; //local variable should need to initialize with any number or else it wont be executed.
                   // local variable does not have any default value
        //System.out.println(x);

    }

        public void sum()
        {
            int a=3;
            int b=4;
            int c=a+b;
            System.out.println("The sum is"+c);
        }
    }




