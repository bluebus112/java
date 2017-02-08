package com.ktds.jjh.hr.biz;

import java.util.List;

import com.ktds.jjh.hr.dao.HRDao;
import com.ktds.jjh.hr.dao.HrDaoImpl;
import com.ktds.jjh.hr.vo.DepartmentVO;
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
	public void printAllDepartment() {
		List<DepartmentVO> department = hrDao.getAllDepartment();

		for (DepartmentVO departments : department) {
			System.out.print(departments.getDepartmentId() + "\t");
			System.out.print(departments.getDepartmentName() + "\t");
			System.out.print(departments.getManagerId() + "\t");
			System.out.println(departments.getLocationId() + "\t");
		}

	}

}
