import java.util.*;
public class NumbersQual{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("MATRIC NUM:- CS2018100965");
        System.out.println("NAME :- ADEGOKE SHERIFF ALABI");
        
        int FirstNum, SecondNum;
        System.out.println("ENTER YOUR FIRST NUMBER");
        FirstNum = input.nextInt();
        
        System.out.println("ENTER YOUR SECOND NUMBER");
        SecondNum = input.nextInt();
        
        if(FirstNum == SecondNum){
            System.out.println("NUMBERS ARE EQUAL");
        }
        else {
            System.out.println("NUMBERS ARE NOT EQUAL");
        }
    }
}