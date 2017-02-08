package com.ktds.jjh.hr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.jjh.hr.vo.DepartmentVO;
import com.ktds.jjh.hr.vo.EmployeesVO;
import com.sun.javafx.geom.RectangularShape;

public class HrDaoImpl implements HRDao {

	/**
	 * 리스트로 담아서 돌려주겠다. 리스트, vo 임포트 트라이 캐치 문 작성.
	 * 
	 * @return
	 */

	public List<EmployeesVO> getAllEmployees() {

		// 1. Oracle Database
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패! 시스템을 종료");
			return null;
		}
		// 2 JDBC Instance 생성
		// 만약에 아래중 하나를 열다가 에러나면 캐치로 가는데 이때 null 그러면 nullpoint익셉션에러
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// 3 JDBC Instance에 연결
		// 작성 후 트라이 캐치생성
		String oracleurl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleurl, "HR", "hr");

			// 4. 쿼리를 만든다
			String query = "  SELECT  " + "   EMPLOYEE_ID, FIRST_NAME, LAST_NAME,  "
					+ "   EMAIL, PHONE_NUMBER, HIRE_DATE,  " + "   JOB_ID, SALARY, COMMISSION_PCT,  "
					+ "   MANAGER_ID, DEPARTMENT_ID  " + "   FROM HR.EMPLOYEES  ";

			// 5 쿼리를 실행한다.
			stmt = conn.prepareStatement(query);

			// 6. 쿼리의 실행 결과를 얻어온다.
			rs = stmt.executeQuery();

			// 6-1 쿼리의 실행결과를 List 객체에 할당한다.
			EmployeesVO employeesVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();
			while (rs.next()) {
				// 6.2 ROW의 정보를 employeesVO에 셋팅한다.
				employeesVO = new EmployeesVO();
				employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				employeesVO.setFirstName(rs.getString("FIRST_NAME"));
				employeesVO.setLastName(rs.getString("LAST_NAME"));
				employeesVO.setEmail(rs.getString("EMAIL"));
				employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				employeesVO.setHireDate(rs.getString("HIRE_DATE"));
				employeesVO.setJobId(rs.getString("JOB_ID"));
				employeesVO.setSalary(rs.getInt("SALARY"));
				employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
				employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
				employeesVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));

				// 6.3 employees에 emplyeesVO를 add한다.
				employees.add(employeesVO);

			}
			// 7. return 한다
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("oracle 인스턴스에 연결하지 못했습니다. 시스템을 종료합니다.");
			return null;
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}

	}

	@Override
	public List<DepartmentVO> getAllDepartment() {

		// 1. Oracle Database
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패! 시스템을 종료");
			return null;
		}
		// 2 JDBC Instance 생성
		// 만약에 아래중 하나를 열다가 에러나면 캐치로 가는데 이때 null 그러면 nullpoint익셉션에러
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// 3 JDBC Instance에 연결
		// 작성 후 트라이 캐치생성
		String oracleurl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleurl, "HR", "hr");
			// 4. 쿼리를 만든다
			String query = "  SELECT  " + " DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID,  " + "   LOCATION_ID "
					+ "  FROM HR.DEPARTMENTS  ";

			// 5 쿼리를 실행한다.
			stmt = conn.prepareStatement(query);

			// 6. 쿼리의 실행 결과를 얻어온다.
			rs = stmt.executeQuery();
			// 6-1 쿼리의 실행결과를 List 객체에 할당한다.
			DepartmentVO departmentVO = null;
			List<DepartmentVO> department = new ArrayList<DepartmentVO>();
			while (rs.next()) {
				// 6.2 ROW의 정보를 departmentVO 에 셋팅한다.
				departmentVO = new DepartmentVO();
				departmentVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
				departmentVO.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				departmentVO.setManagerId(rs.getInt("MANAGER_ID"));
				departmentVO.setLocationId(rs.getInt("LOCATION_ID"));

				// 6.3 employees에 emplyeesVO를 add한다.
				department.add(departmentVO);
			}
			// 7. return 한다
			return department;

		} catch (SQLException e) {
			System.out.println("oracle 인스턴스에 연결하지 못했습니다. 시스템을 종료합니다.");
			e.printStackTrace();
			return null;
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}
		
	}

	@Override
	public List<EmployeesVO> getAllEmployeesWithDepartments() {
		return null;
	}

}
