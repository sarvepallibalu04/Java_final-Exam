/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_9;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Question_9 {
static void validate(int age){
    System.out.println("Question 9 : Balaji Sarvepalli");
	     if(age<18)  
	      throw new ArithmeticException("not valid"); 
       	     else  
	      System.out.println("welcome to vote");  
	   }  
	   public static void main(String args[]){  
	      validate(13);  
	      System.out.println("rest of the code...");  
	  }  
} 
