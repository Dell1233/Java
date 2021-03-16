package javaDemo;

public class StringDemo1 {

    public static void main(String[] args) {

        String actual = "Welcome to Selenium WebDriver World";
        String expected= "welcome to Selenium WebDriver World";

        boolean status= actual.equals(expected);
        boolean status1= actual.equalsIgnoreCase(expected);
        System.out.println("Status is "+ status);
        System.out.println("Status is "+ status1);

        //if the uppercase and lowercase will not match  then it will be false
        //if we want to ignore the case then use: equalsignorecase();
        //if i will change the content then it will give me false.


    }
}
