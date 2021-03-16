package javaDemo;

public class StringClass {

    //String is a class belongs to java.lang.String.
    //it has many inbuilt methods  which helps to perform operations like comparing,converting,spilt,concatenate etc.
    //starts with ()and ends with () method which will return true or false.

    public static void main(String[] args) {

        String name= "Selenium WebDriver";
        boolean status =name.startsWith("Selenium");
        System.out.println("status is"+ status);
        String name1= " Welcome to Selenium WebDriver World";
        boolean status1 =name1.endsWith("World"); // we will change the last word then it will give you false.
        System.out.println("status is"+ status1);


    }
}
