/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_11;

import java.util.Objects;

/**
 *
 * @author Balaji Sarvepalli
 */
    public class Customer {
    int custId;  
    
    public String custName; 
    // This method is used to get the custid of the Customer
    public int getcustId() {
        return custId;
    }
    // This method is used to set the Custid of the Customer
    public void setCustId(int custId) {
	this.custId = custId;
    }
    // This method is used to get the CustName of the Customer
    public String getCustName() {
	return custName;
    }
    // This method is used to set the CustName of the Customer
    public void setCustName(String CustName) {
	this.custName = custName;
    }
    // The constructor Customer with the two arguments
    public Customer(int custId,String custName){  
 	this.custId=custId;  
 	this.custName=custName;                  
    }
    @Override    //Overriding the equals method
    public boolean equals(Object obj) {
        // The object is same and it will returns true.
        if (this == obj) {
            return true;
        }
        // The equals checks the object is null and then it will returns false
        if (obj == null) {
            return false;
        }
        // if the hash code is returned by the current class.The Object of the class and it will returns false,if does not match
        if (getClass() != obj.getClass()) {
            return false;
        }
        // if the current Customer and Customer of other does not match it returns false or otherwise it will returns true.
        final Customer other = (Customer) obj;
        if (this.custId != other.custId) {
            return false;
        }
        //if the current custName and custName of other does not match it returns false otherwise it returns true.
        if (!Objects.equals(this.custName, other.custName)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        // Initialising the variable hash with value of 4
        int hash = 4;
        // Converting into the hash
        hash = 97 * hash + this.custId;
        // Converting the custName into hash
        hash = 97 * hash + Objects.hashCode(this.custName);
        return hash;
    }
        
}