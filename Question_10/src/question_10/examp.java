/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_10;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Examp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int result = sum(10);
    System.out.println("Question 10 : Balaji Sarvepalli");
    System.out.print("The sum of the result :"); 
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}

