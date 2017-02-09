package com.ktds.jjh.hr.dao;

import java.util.List;

import com.ktds.jjh.hr.vo.EmployeesVO;

public interface HRDao {

	public List<EmployeesVO> getAllEmployees();

	public List<EmployeesVO> getAllEmployeesWithJobs();

	// 한명의 정보만 불러오려고 할 때.
	public EmployeesVO findOneEmployee(int employeeId);

}
