/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_11;

/**
 *
 * @author Balaji Sarvepalli
 */
public class CustomerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creating two instances
        Customer C1 = new Customer(1, "CUST");
        Customer C2 = new Customer(1, "CUST"); 
        // comparing above created Objects.
        System.out.println("Question 11 : Balaji Sarvepalli");
        // Printing the two hashcode of instances
        System.out.println("hashcode of first CUST = " + C1.hashCode());
        System.out.println("hashcode of second CUST = " + C2.hashCode());
        System.out.println("equals value is = " + C1.equals(C2));
	}

}
