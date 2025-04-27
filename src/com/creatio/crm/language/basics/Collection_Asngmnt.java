package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Collection_Asngmnt {

	public static void main(String[] args) {
	System.out.println("==============Collections==========================");
	//List , Set and Map
	
	
	 //List - ArrayList, LinkedList ==> size is not fixed
	 //ArrayList ==> Insertion Order , Allow Duplicates
	System.out.println("========List - ArrayList==========================");
	
	 List<String> employeeNamesList = new ArrayList<String>();
	 employeeNamesList.add("Lakshmi");
	 employeeNamesList.add("Sunil");
	 employeeNamesList.add("Anjali");
	 employeeNamesList.add("Siddartha");
	 employeeNamesList.add("Lakshmi");
	 employeeNamesList.add(2,"ABC");
	 employeeNamesList.remove(2);
	
	 System.out.println(employeeNamesList);
	 System.out.println("Size : "+employeeNamesList.size());
	
	 List<Integer> employeeidsList = new ArrayList<Integer>();
	 employeeidsList.add(1);
	 employeeidsList.add(2);
	employeeidsList.add(3);
	employeeidsList.add(4);
	 employeeidsList.add(1);
 System.out.println(employeeidsList);
	
	//LinkedList ==> Insertion Order , Allow Duplicates
	
	 System.out.println("=======List - LinkedList====================");
	
	 List<String> employeeNamesLinkList = new LinkedList<String>();
	 employeeNamesLinkList.add("Lakshmi");
     employeeNamesLinkList.add("Sunil");
	 employeeNamesLinkList.add("Anjali");
	 employeeNamesLinkList.add("Siddartha");
	 employeeNamesLinkList.add("Lakshmi");
	
	 System.out.println(employeeNamesLinkList);
	 System.out.println("Size : "+employeeNamesLinkList.size());
	
	 List<Integer> employeeIdsLinkList = new LinkedList<Integer>();
	 employeeIdsLinkList.add(1);
	 employeeIdsLinkList.add(2);
	 employeeIdsLinkList.add(3);
	 employeeIdsLinkList.add(4);


	 employeeIdsLinkList.add(1);
	 System.out.println(employeeIdsLinkList);

	Map<String,String > Employee1Map = new HashMap<String,String>();
	Employee1Map.put("Employee ID","E001");
	Employee1Map.put("Name","Alice Green");
	Employee1Map.put("Age","30");
	Employee1Map.put("Gender","Female");
	Employee1Map.put("Department","Engineering");
	Employee1Map.put("Position","Software Engineer");
	Employee1Map.put("Salary","75,000");
	Employee1Map.put("Email","alice@example.com");
	Employee1Map.put("Contact Number","9876543213");
	System.out.println("Employee 1 details :"+Employee1Map);
	
	//Below Employee2Map details are stored using Map(HashMap) 
	
	Map<String,String > Employee2Map = new HashMap<String,String>();
	Employee2Map.put("Employee ID","E002");
	Employee2Map.put("Name","Bob Johnson");
	Employee2Map.put("Age","35");
	Employee2Map.put("Gender","Male");
	Employee2Map.put("Department","Marketing");
	Employee2Map.put("Position","Marketing Manager");
	Employee2Map.put("Salary","85,000");
	Employee2Map.put("Email","bob@example.com");
	Employee2Map.put("Contact Number","9876543214");
	System.out.println("Employee 2 details :"+Employee2Map);
	
	//Below Employee3Map details are stored using Map(HashMap) 
	
	Map<String,String > Employee3Map = new HashMap<String,String>();
	Employee3Map.put("Employee ID","E003");
	Employee3Map.put("Name","Carol White");
	Employee3Map.put("Age","28");
	Employee3Map.put("Gender","Female");
	Employee3Map.put("Department","Sales");
	Employee3Map.put("Position","Sales Executive");
	Employee3Map.put("Salary","65,000");
	Employee3Map.put("Email","carol@example.com");
	Employee3Map.put("Contact Number","9876543215");
	System.out.println("Employee 3 details :"+Employee3Map);
	
	List<Map<String,String >> empList = new ArrayList<Map<String,String >>();
	empList.add(Employee1Map);
	empList.add(Employee2Map);
	empList.add(Employee3Map);
	System.out.println("Employee List :"+empList);
	

	System.out.println("Email of 2nd row Employee Data: "+empList.get(1).get("Email")); 
}
}