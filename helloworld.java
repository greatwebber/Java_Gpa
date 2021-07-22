package project2;

import java.util.*;

public class Project2 {

public static void main(String[] args) {

    String Name;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your age : ");
    age = input.nextInt();
    if (age>=16){
        System.out.println("Your good to go");}
    else if ((age>=1)&&(age<=15)){       
        System.out.println("Your not allowed to Procced");}
    else{
        System.out.println("Out of range");}
    }
}