/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_3;

/**
 *
 * @author Balaji Sarvepalli
 */
public class SunFlower extends Flower
{
  public void smell(){
      
    System.out.println("SunFlower gives Good smell");
  }
    public static void main(String args[])
  {
    System.out.println("Question 3 : Balaji Sarvepalli");
    Flower F = new Flower();
    SunFlower SF = new SunFlower();
    SF.smell();	                
    SF.smell();	                

    F = SF; // subclass to super class, it is valid
    F.smell();		        
	                // super class to subclass, not valid
    SF = (SunFlower) F;               // explicit casting
    F.smell();			
  }
}
