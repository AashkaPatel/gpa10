//Personalized GPA Calculator for end of sophomore year 

package gpa10;

import java.util.Scanner; 
/**
 *
 * @author Aashka Patel
 */
public class GPA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner blah = new Scanner (System.in);
        
        String grade;
        
        double credit1;
        double credit2;
        double credit3;
        double credit4;
        double credit5; 
        double credit6;
        double credit7;
        double credit8;
        double credit9;
        
        double totPtsClass1;
        double totPtsClass2;
        double totPtsClass3;
        double totPtsClass4;
        double totPtsClass5;
        double totPtsClass6;
        double totPtsClass7;
        double totPtsClass8;
        double totPtsClass9;
        
        double points; 
        
        double gradeValue=0;
        double totPts;
        double totalCredits;
        double gpa;
        
        System.out.println ("Enter the number of credits of the class and the grade earned in that class.");
        
        System.out.println("English II Honors: "); 
        credit1 = blah.nextDouble();
        grade = blah.next();
        
        points = convert(grade); 
        
        totPtsClass1 = points * credit1;
       
        System.out.println("Algebra II/Trigonometry Honors: ");
        credit2 = blah.nextDouble();
        grade = blah.next();
        
        points = convert(grade);
        
        totPtsClass2 = points * credit2;
        
        System.out.println("Chemistry Honors: ");
        credit3 = blah.nextDouble();
        grade = blah.next();
        
        points = convert(grade);
        
        totPtsClass3 = points * credit3;
        
        System.out.println("U.S. History I Honors: ");
        credit4 = blah.nextDouble();
        grade = blah.next();
        
        points = convert(grade);
        
        totPtsClass4 = points * credit4;
        
        System.out.println("Spanish II: ");
        credit5 = blah.nextDouble();
        grade = blah.next();
        
        points = convert(grade);
             
        totPtsClass5 = points * credit5;
        
        System.out.println("Computer Science Analysis and Design: ");
        credit6 = blah.nextDouble();
        grade = blah.next();
        
        points = convert(grade);
        
        totPtsClass6 = points * credit6;
        
        System.out.println("Public Speaking: "); 
        credit7 = blah.nextDouble();
        grade = blah.next();
        
        points = convert(grade);
        
        totPtsClass7 = points * credit7;
        
        System.out.println("Financial Literacy: "); 
        credit8 = blah.nextDouble();
        grade = blah.next();
        
        points = convert(grade);
        
        totPtsClass8 = points * credit8;
        
        System.out.println("Physical Education/Driver's Ed: ");
        credit9 = blah.nextDouble();
        grade = blah.next();
        
        points = convert(grade);
        
        totPtsClass9 = points * credit9;
        
        
        //GPA Calculation 
        totPts= totPtsClass1+totPtsClass2+totPtsClass3+totPtsClass4+totPtsClass5+totPtsClass6+totPtsClass7+totPtsClass8+totPtsClass9;
        
        totalCredits = credit1+credit2+credit3+credit4+credit5+credit6+credit7+credit8+credit9;
        gpa = totPts / totalCredits;
        
        System.out.printf("Your GPA is: %.3f\n", + gpa);
    }
    
   
     public static double convert(String grade) {
        
        double gradeValue=0;
        
        if (grade.equalsIgnoreCase("A+"))
            gradeValue= 5.30;
        else if (grade.equalsIgnoreCase("A"))
            gradeValue= 5.00;
        else if (grade.equalsIgnoreCase("A-"))
            gradeValue = 4.70;
        else if (grade.equalsIgnoreCase("B+"))
            gradeValue = 4.30;
        else if (grade.equalsIgnoreCase("B"))
            gradeValue = 4.00;
        else if (grade.equalsIgnoreCase("B-"))
            gradeValue = 3.70;
        else if (grade.equalsIgnoreCase("C+"))
            gradeValue = 3.30;
        else if (grade.equalsIgnoreCase("C"))
            gradeValue = 3.00;
        else if (grade.equalsIgnoreCase("C-"))
            gradeValue = 2.70;
        else if (grade.equalsIgnoreCase("D+"))
            gradeValue = 2.30;
        else if (grade.equalsIgnoreCase("D"))
            gradeValue = 1.00;
        else if (grade.equalsIgnoreCase("D-"))
            gradeValue = 0.70;
        else if (grade.equalsIgnoreCase("F"))
            gradeValue = 0.00;
        else
            System.out.println ("Invalid Grade. Run again.");
        
        return gradeValue;
     }
}
