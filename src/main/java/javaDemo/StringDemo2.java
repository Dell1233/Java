package javaDemo;

public class StringDemo2 {

    public static void main(String[] args) {

        String actual = "Welcome to Selenium WebDriver World";
        String expected = " Selenium ";
        boolean status= actual.contains(expected);
        System.out.println("status is"+status);
        String expected1= "java";
        boolean status1= actual.contains(expected1);
        System.out.println("status is"+status1);
        //if expected wil not contain whatever actual is there, it will be false

    }
}
