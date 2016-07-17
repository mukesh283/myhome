package com.flp.ems.view;

import java.util.HashMap;
import java.util.Scanner;

import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;
public class UserInteraction {
	
public void AddEmployee()
	{
	
	EmployeeServiceImpl empl=new EmployeeServiceImpl();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name:");
		boolean flag=true;
	    String name1 = sc.nextLine();  
		flag=Validate.validateName(name1);
	 if(flag==false)
			 System.out.println("wrong input...ReEnter the valid name");
	
		System.out.println("Enter the Address:");
		String ad=sc.nextLine();
		System.out.println("Enter the EmailId:");
		
		String emailid=sc.nextLine();
		flag=Validate.validateEmail(emailid);
		if(flag==false)
			System.out.println("Invalid EmailId***");
		//hs.add(emailid);
		System.out.println("Enter Phn no");
		int phn=sc.nextInt();
		System.out.println("Enter KinId");
		Scanner s=new Scanner(System.in);
		String kinId=s.nextLine();
		
		System.out.println("Enter DOB");
		Scanner sc1=new Scanner(System.in);
		String dob=sc1.nextLine();
		System.out.println("enter DOJ");
		String doj=sc1.nextLine();
		System.out.println("Department list");
		String[] str={"FS","NFS"};
		System.out.println("FS,NFS");
		System.out.println("enter 1 for FS,enter 2 for NFS");
		int i=sc1.nextInt();
		String departname = null;
		String description1 = null;
			switch(i){
		
		case 1:
			departname=str[0];
			description1="Financial Sevice";
			break;
		case 2:
			departname=str[1];
			description1="NonFinancial Service";
			break;
			default:
				System.out.println("wrong input");
		}
		System.out.println("Enter projectname");
		Scanner sc2 = new Scanner(System.in);
		String projname=sc2.nextLine();
		System.out.println("Enter Rolename");
		String rolename=sc2.nextLine();
		
		HashMap hm=new HashMap();
		hm.put(1,name1);
		hm.put(2, ad);
		hm.put(3, emailid);
		hm.put(4,phn);
		hm.put(5,dob);
		hm.put(6,doj);
		hm.put(7,departname);
		hm.put(8,description1);
		hm.put(9,projname);
		hm.put(10,rolename);
		hm.put(11, kinId);
		empl.AddEmployee(hm);
	}

public void SearchEmployee() 
	{
	System.out.println("search by kinid,or emailid or name");
	System.out.println("1 to search by kinid");
	System.out.println("2 to search by emailId");
	System.out.println("3 to search by name");
	Scanner sc=new Scanner(System.in);
	EmployeeServiceImpl es=new EmployeeServiceImpl();
	int i=sc.nextInt();
	switch(i){
	case 1:
	System.out.println("enter the kin id to search");
	Scanner sc1=new Scanner(System.in);
	String searchby_kinid=sc1.nextLine();
	es.SearchEmployee(searchby_kinid,1);
	break;
	case 2:
		System.out.println("enter the emailid to search");
		Scanner sc3=new Scanner(System.in);
		String searchby_email=sc3.nextLine();
		es.SearchEmployee(searchby_email,2);
		break;
	case 3:
		System.out.println("Enter the name to search the employee");
		Scanner sc4=new Scanner(System.in);
		String searchby_name=sc4.nextLine();
		es.SearchEmployee(searchby_name,3);
		break;
	}
		
	}

public void ModifyEmployee() 
    {
	
	
	
	}

public void RemoveEmployee() 
	{
	
	}

public void getAllEmployee() 
	{
	
	}
}
