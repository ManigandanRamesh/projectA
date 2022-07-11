package com.chainsys.springproject.dao;

import java.util.Scanner;

import com.chainsys.springproject.commonutil.ExceptionManager;
import com.chainsys.springproject.commonutil.InvalidInputDataException;
import com.chainsys.springproject.commonutil.Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class EmployeeController {
public   void addNewEmployee() {
		
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		try {
		System.out.println("Enter the Employee id:");
		String emp_id=sc.nextLine();
		try {
			Validator.checkStringForParseInt(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 
			
		}
		int id=Integer.parseInt(emp_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 
		}
		emp.setEmp_id(id);
		System.out.println("Enter Employee first name:");
		String emp_Firstname=sc.nextLine();
		try {
			Validator.checkStringOnly(emp_Firstname);
		}catch(InvalidInputDataException e) {
			System.out.println("Error:"+e.getMessage());
			 
		}
		emp.setFirst_name(emp_Firstname);
		System.out.println("Enter Employee Last Name:");
		String emp_LastName=sc.nextLine();
		try {
			Validator.checkStringOnly(emp_LastName);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(1);
		}
		emp.setLast_name(emp_LastName);
	    System.out.println("Enter Employee Email:");
	    String emp_email=sc.nextLine();
	    try {
			Validator.checkEmail(emp_email); 
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 
		}
	    emp.setEmail(emp_email);
	    System.out.println("Enter Employee hire_date like \"dd/mm/yyyy\":");
	    SimpleDateFormat hire_dateFormate=new SimpleDateFormat("dd/MM/yyyy");
	    String emp_HireDate=sc.nextLine();
	    //Date hire_date=hire_dateFormate.parse(emp_HireDate);
	    try {
			emp.setHire_date(hire_dateFormate.parse(emp_HireDate));
		} catch (ParseException e) {
			e.printStackTrace();
			 
		}
	    System.out.println("Enter the job_id:");
	    String emp_Job_id=sc.nextLine();
	    try {
	    	Validator.checkJobId(emp_Job_id);
	    }catch(InvalidInputDataException e) {
	    	e.printStackTrace();
	    	 
	    }
	    emp.setJob_id(emp_Job_id);
	    System.out.println("Enter Salary of Employee:");
	    Float emp_salary=0.0f;
	    try {
	    	emp_salary=sc.nextFloat();
			Validator.checkSalaryLimit(emp_salary);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 
		}
	    emp.setSalary(emp_salary);
	    EmployeeDao dao = new EmployeeDao();
	    int result=dao.insertEmployee(emp);
	    System.out.println(result+"row inserted");
	    sc.close();
		}catch(Exception e) {
			e.printStackTrace();
			 
		}
	}
	public   void viewEmployeeDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee id:");
		int emp_id=0;
		try {
			emp_id=sc.nextInt();
			Validator.CheckNumberForGreaterThanZero(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 
		}
		EmployeeDao ed = new EmployeeDao();
		Employee emp=ed.getEmployeeById(emp_id);
		System.out.println("Employee id:"+emp.getEmp_id());
		System.out.println("Employee First Name:"+emp.getFirst_name());
		System.out.println("Employee last Name :"+emp.getLast_name());
		System.out.println("Employee hired date:"+emp.getHire_date());
		System.out.println("Employee job_id:"+emp.getJob_id());
		System.out.println("Employee Salary:"+emp.getSalary());
		sc.close();
	}
	public   void ViewAllEmployeeDetails() {
		EmployeeDao emd = new EmployeeDao();
		List<Employee> emplist =emd.getAllEmployee();
		Iterator<Employee> empItr=emplist.iterator();
		while(empItr.hasNext()) {
			Employee emp=empItr.next();
			System.out.println("emp id:"+emp.getEmp_id());
		}
	}
	public   void updateEmpDetails() {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		System.out.println("Enter the Employee id:");
		String emp_id=null;
		try {
			emp_id=sc.nextLine();
			Validator.checkStringOnly(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 
		}
		int id=Integer.parseInt(emp_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 
		}
		emp.setEmp_id(id);
		System.out.println("Enter Employee first name:");
		String emp_Firstname=sc.nextLine();
		try {
			Validator.checkStringOnly(emp_Firstname);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 
		}
		emp.setFirst_name(emp_Firstname);
		System.out.println("Enter Employee Last Name:");
		String emp_LastName=sc.nextLine();
		try {
			Validator.checkStringOnly(emp_LastName);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 
		}
		emp.setLast_name(emp_LastName);
	    System.out.println("Enter Employee Email:");
	    String emp_email=sc.nextLine();
	    try {
			Validator.checkEmail(emp_email);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 
		}
	    emp.setEmail(emp_email);
	    System.out.println("Enter Employee hire_date like \"dd/mm/yyyy\":");
	    SimpleDateFormat hire_dateFormate=new SimpleDateFormat("dd/MM/yyyy");
	    String emp_HireDate=sc.nextLine();
	    //Date hire_date=hire_dateFormate.parse(emp_HireDate);
	    try {
			emp.setHire_date(hire_dateFormate.parse(emp_HireDate));
		} catch (ParseException e) {
			e.printStackTrace();
			 
		}
	    System.out.println("Enter the job_id:");
	    String emp_Job_id=sc.nextLine();
	    try {
	    	Validator.checkJobId(emp_Job_id);
	    }catch(InvalidInputDataException e) {
	    	e.printStackTrace();
	    	 
	    }
	    emp.setJob_id(emp_Job_id);
	    System.out.println("Enter Salary of Employee:");
	    Float emp_salary=sc.nextFloat();
	    try {
	    	Validator.checkSalaryLimit(emp_salary);
	    }catch(InvalidInputDataException e) {
	    	e.printStackTrace();
	    	 
	    }
	    emp.setSalary(emp_salary);
	    EmployeeDao emo = new EmployeeDao();
	    int result= emo.updateEmployee(emp);
	    System.out.println(result+"row updated");
	    sc.close();
	}
	public   void deleteEmpdetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int emp_id=0;
		try {
			emp_id=sc.nextInt();
			Validator.CheckNumberForGreaterThanZero(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 
		}
		EmployeeDao emp1 = new EmployeeDao();
		int result = emp1.deleteEmployee(emp_id);
		System.out.println(result+"row deleted");
		sc.close();
	}
	public   void updateEmployeeSalary() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int  emp_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 	
		}
		System.out.println("Enter Employee Salary:");
		float salary=sc.nextInt();
		try {
			Validator.checkSalaryLimit(salary);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 	
		}
		EmployeeDao emp2 = new EmployeeDao();
		int result=emp2.updateEmployeeSalary(emp_id,salary);
		System.out.println(result+" row updated");
		sc.close();
	}
	public   void updateEmployeeFirstName() {
        java.util.Scanner sc =new java.util.Scanner(System.in); 
        
        Employee newemp=new Employee();
        System.out.println("Enter Employee Id :");
        int empId=sc.nextInt();
        try {
			Validator.CheckNumberForGreaterThanZero(empId);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			 	
		}
          newemp.setEmp_id(empId); 
          System.out.println("Enter Update Name :");
          String update_name= sc.nextLine();
          try {
  			Validator.checkStringOnly(update_name);
  		}catch(InvalidInputDataException e) {
  			e.printStackTrace();
  			 	
  		}
          EmployeeDao emp3 = new EmployeeDao();
          int result =emp3.updateEmployeeFirstName(empId,update_name);
          System.out.println(result);
        
      }

}
