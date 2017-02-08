package com.ktds.jjh.hr.dao;

import java.util.List;

import com.ktds.jjh.hr.vo.DepartmentVO;
import com.ktds.jjh.hr.vo.EmployeesVO;

public interface HRDao {

	public List<EmployeesVO> getAllEmployees();
	
	public List<DepartmentVO> getAllDepartment();
	
	public List<EmployeesVO> getAllEmployeesWithDepartments();
	
	

}
