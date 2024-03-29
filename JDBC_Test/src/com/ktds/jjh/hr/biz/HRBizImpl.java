package com.ktds.jjh.hr.biz;

import java.util.List;

import com.ktds.jjh.hr.dao.HRDao;
import com.ktds.jjh.hr.dao.HrDaoImpl;
import com.ktds.jjh.hr.vo.EmployeesVO;

public class HRBizImpl implements HRBiz {

	private HRDao hrDao;

	public HRBizImpl() {
		hrDao = new HrDaoImpl();
	}

	@Override
	public void printAllEmployees() {
		List<EmployeesVO> employees = hrDao.getAllEmployees();

		for (EmployeesVO employee : employees) {
			System.out.print(employee.getEmployeeId() + "\t");
			System.out.print(employee.getFirstName() + "\t");
			System.out.print(employee.getLastName() + "\t");
			System.out.print(employee.getEmail() + "\t");
			System.out.print(employee.getPhoneNumber() + "\t");
			System.out.print(employee.getHireDate() + "\t");
			System.out.print(employee.getJobId() + "\t");
			System.out.print(employee.getSalary() + "\t");
			System.out.print(employee.getCommissionPct() + "\t");
			System.out.print(employee.getManagerId() + "\t");
			System.out.println(employee.getDepartmentId() + "\t");

		}

	}

	@Override
	public void printAllEmployeesWithJobs() {

		List<EmployeesVO> allEmployees = hrDao.getAllEmployeesWithJobs();

		for (EmployeesVO employeesVO : allEmployees) {
			System.out.print(employeesVO.getEmployeeId() + "\t");
			System.out.print(employeesVO.getFirstName() + "\t");
			System.out.print(employeesVO.getLastName() + "\t");
			System.out.print(employeesVO.getEmail() + "\t");
			System.out.print(employeesVO.getPhoneNumber() + "\t");
			System.out.print(employeesVO.getHireDate() + "\t");
			System.out.print(employeesVO.getJobId() + "\t");
			System.out.print(employeesVO.getSalary() + "\t");
			System.out.print(employeesVO.getCommissionPct() + "\t");
			System.out.print(employeesVO.getManagerId() + "\t");
			System.out.print(employeesVO.getDepartmentId() + "\t");
			System.out.print(employeesVO.getJobs().getJobId() + "\t");
			System.out.print(employeesVO.getJobs().getJobTitle() + "\t");
			System.out.print(employeesVO.getJobs().getMinSalary() + "\t");
			System.out.println(employeesVO.getJobs().getMaxSalary() + "\t");
		}
	}

	@Override
	public void findOneEmployees(int emplyeeId) {
		EmployeesVO employees = hrDao.findOneEmployee(emplyeeId);

		System.out.print(employees.getEmployeeId() + "\t");
		System.out.print(employees.getFirstName() + "\t");
		System.out.print(employees.getLastName() + "\t");
		System.out.print(employees.getEmail() + "\t");
		System.out.print(employees.getPhoneNumber() + "\t");
		System.out.print(employees.getHireDate() + "\t");
		System.out.print(employees.getJobId() + "\t");
		System.out.print(employees.getSalary() + "\t");
		System.out.print(employees.getCommissionPct() + "\t");
		System.out.print(employees.getManagerId() + "\t");
		System.out.println(employees.getDepartmentId() + "\t");

	}

}
