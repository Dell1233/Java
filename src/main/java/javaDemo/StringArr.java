package javaDemo;

public class StringArr {
    public static void main(String[] args) {
        //spilt(expression)- it will return array of string
        String fullname = "Selenium-HP-QTP-Grid";
       String [] arr= fullname.split("-");

       for(int i=0;i<= arr.length;i++)
       {
           System.out.println("array value for  "   + i +   "is" +   arr[i]);
           if (arr[i].equalsIgnoreCase("Selenium"))
           {
               System.out.println("Test passed") ;
               break; //break- it will not print rest.It will come out of the for loop.
           }

       }

    }

}
