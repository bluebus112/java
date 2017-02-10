package com.ktds.jjh.biz;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ktds.jjh.dao.HRDao;
import com.ktds.jjh.dao.HRDaoImpl;
import com.ktds.jjh.dao.support.QueryHandler;
import com.ktds.jjh.vo.DepartmentVO;
import com.ktds.jjh.vo.EmployeesVO;

public class HRBizImpl implements HRBiz {

	private HRDao hrDao;

	public HRBizImpl() {
		hrDao = new HRDaoImpl();

	}

	@Override
	public void printAllEmployeesWithDepartmentWithJobs() {

		List<EmployeesVO> employees = hrDao.getAllEmpolyeesWithDepartmentWithJobs();

		for (EmployeesVO employee : employees) {
			System.out.print(employee.getEmployeeId() + "\t");
			System.out.print(employee.getDepartmentVO().getDepartmentName() + "\t");
			System.out.print(employee.getDepartmentVO().getLocationVO().getCity() + "\t");
			System.out.println(employee.getJobsVO().getJobTitle() + "\t");

		}

	}

}
