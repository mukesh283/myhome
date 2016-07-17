package com.flp.ems.service;

import java.util.HashMap;

public interface IEmployeeService {
	
	public void AddEmployee(HashMap hm);
	public void	ModifyEmployee();
	public void RemoveEmployee();
	public void SearchEmployee(String search,int i);
	public void getAllEmployee();
}
