/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseifstatements2;

/**
 *
 * @author nyawira
 */
import java.util.Scanner;

public class IfElseIf_Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      char grade;
      System.out.println("Enter Grade between A and D:");
      Scanner sn = new Scanner(System.in);
      grade =sn.next().charAt(0);
      
      if (grade=='A'){
          System.out.println("First Class");
      }
      else if (grade=='B'){
          System.out.println("Second Upper");
      }
      else if (grade=='C'){
          System.out.println("Second Lower");
      }
      else if (grade=='D'){
          System.out.println("Pass");
      }
      else {
          System.out.println("Fail");
      }
    
    }
    
}
