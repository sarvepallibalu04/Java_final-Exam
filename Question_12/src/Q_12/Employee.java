/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_12;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Employee implements Comparable<Employee> {
	
	int empId;  
	String empName;  
	int empSalary; 
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

 	Employee(int empId,String empName,int empSalary){  
 		this.empId=empId;  
 		this.empName=empName;  
 		this.empSalary=empSalary;  
	}

	@Override
	public int compareTo(Employee arg0) {
		if(empId==arg0.empId)  
			return 0;  
			else if(empId>arg0.empId)  
			return 1;  
			else  
			return -1;  
	}
	
	 public String toString() {
	        return empId +" "+ empName +" "+ empSalary +" ";
	    }
}

