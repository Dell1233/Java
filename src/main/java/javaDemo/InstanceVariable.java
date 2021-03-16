package javaDemo;

public class InstanceVariable {

        int roll;
        double marks;
        int x=100;//instance variable
        //it can be declared in class but outside the method, constructor and block
        //it has default value: data type: int,byte,short,long=0,float,double=0.0,boolean-false

    //constructor has same name as class name and doesnot have any return type.
    public InstanceVariable(int roll,double marks) //constructor
    {
        this.marks=marks;
        this.roll= roll;


    }

        public static void main(String[] args)
        {

            InstanceVariable obj1= new InstanceVariable(1,80.5);
            // in each instance we will get a different copy so we called it s a instance variable
            obj1.show();
            InstanceVariable obj2= new InstanceVariable(4,90.1);
            obj2.show();
            InstanceVariable obj3= new InstanceVariable(6 ,30.2);
            obj3.show();


        }
        public void show()
        {
            int x=90;
            System.out.println(x);
            //if same variable name will be in local and global,higher preference will be for local variable.so it will print 90
            System.out.println("Roll num"+""+"and marks are "+marks);

        }
}
