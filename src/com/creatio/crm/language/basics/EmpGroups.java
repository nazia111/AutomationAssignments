package com.creatio.crm.language.basics;

public class EmpGroups {
 
	public static void main(String[] args)
	{
		String[] name= new String[3];
		int[] id= new int[3];
		
		Employees emp=new Employees();
		name[0]= emp.empName1;
		name[1]= emp.empName2;
		name[2]= emp.empName3;
		
		id[0]=emp.empId1;
		id[1]=emp.empId2;
		id[2]=emp.empId3;
		
		System.out.println("Employee Name:" +name[0] +","+ "Employee Id:" +id[0]);
		System.out.println("Employee Name:" +name[1] +","+ "Employee Id:" +id[1]);
		System.out.println("Employee Name:" +name[2] +","+ "Employee Id:" +id[2]);
	}
	
}
