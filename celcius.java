import java.util.*;
public class celcius {
    public static void main(String args[]) {
      Scanner input = new Scanner (System.in);
      System.out.println("MATRIC NUM:- CS2018100965");
      System.out.println("NAME :- ADEGOKE SHERIFF ALABI");
      
      float F, C;
      System.out.println("Enter Fahrenheit Value ");
      F = input.nextFloat();
      C = (( F - 32 ) * 100) / (212 - 32);
      
      System.out.println("C celcius = "+ C);
    }
}