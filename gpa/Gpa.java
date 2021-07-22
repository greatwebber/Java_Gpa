import java.util.*;
public class Gpa {
    public static void main(String args[]) {
     Scanner Input = new Scanner(System.in);
     String FirstName, SecondName, MatricNum;
     double UnitScore = 18;
    //  Enter Your First Name
     System.out.println("Enter Your First Name: ");
     FirstName = Input.nextLine();
    //  Enter Your Second Name
     System.out.println("Enter Your Second Name: ");
     SecondName = Input.nextLine();
    //  Enter Matric No
     System.out.println("Enter Your Matric No: ");
     MatricNum = Input.nextLine();
     
    //  Course input array
     int[] CourseCode = {1,2,3,4,5,6,7};
     
     System.out.println("Enter Your COM121 Score : ");
     CourseCode[0] = Input.nextInt();
     
     System.out.println("Enter Your COM122 Score : ");
     CourseCode[1] = Input.nextInt();
     
     System.out.println("Enter Your COM123 Score : ");
     CourseCode[2] = Input.nextInt();
     
     System.out.println("Enter Your COM124 Score : ");
     CourseCode[3] = Input.nextInt();
     
     System.out.println("Enter Your COM125 Score : ");
     CourseCode[4] = Input.nextInt();
     
     System.out.println("Enter Your COM126 Score : ");
     CourseCode[5] = Input.nextInt();
     
     System.out.println("Enter Your COM127 Score : ");
     CourseCode[6] = Input.nextInt();
     
    // Grade Functions
     double Grade = 0;
     for(int i = 0; i < CourseCode.length; i++ ){
        Grade += CourseCode[i];
     }
     System.out.println("Dear"+ " " +FirstName +" " + SecondName+" "+ "Your Grade is : "+ Grade);
    
    //Uint Function
     UnitScore = Grade / UnitScore;

     System.out.println("Your Unit Score is :"+ UnitScore);

     if(UnitScore < 2.0){
         System.out.println("Propabation");
     }
     else if(UnitScore >= 2.0 && UnitScore <= 2.5){
         System.out.println("LOWER");
     }
     else if(UnitScore >2.5 && UnitScore <= 3.0){
         System.out.println("STRONG LOWER");
     }
     else if(UnitScore >3.0 && UnitScore <= 4.0){
         System.out.println("UPPER CLASS");
     }
     else{
         System.out.println("NO RESULT");
     }
    }
}