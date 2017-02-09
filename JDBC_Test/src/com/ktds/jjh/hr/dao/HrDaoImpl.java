package com.ktds.jjh.hr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.jjh.dao.support.JDBCDaoSupport;
import com.ktds.jjh.dao.support.QueryHandler;
import com.ktds.jjh.dao.support.annotations.BindData;
import com.ktds.jjh.hr.vo.CountriesVO;
import com.ktds.jjh.hr.vo.DepartmentVO;
import com.ktds.jjh.hr.vo.EmployeesVO;
import com.ktds.jjh.hr.vo.JobsVO;
import com.ktds.jjh.hr.vo.RegionsVO;

public class HrDaoImpl extends JDBCDaoSupport implements HRDao {

	/**
	 * 리스트로 담아서 돌려주겠다. 리스트, vo 임포트 트라이 캐치 문 작성.
	 * 
	 * @return
	 */
	@Override
	public List<EmployeesVO> getAllEmployees() {

		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				StringBuffer query = new StringBuffer();

				query.append(" SELECT	EMPLOYEE_ID");
				query.append("		 	, FIRST_NAME");
				query.append("	  		, LAST_NAME");
				query.append("	  		, EMAIL");
				query.append("			, PHONE_NUMBER");
				query.append("			, HIRE_DATE");
				query.append("			, JOB_ID");
				query.append("			, SALARY");
				query.append("			, COMMISSION_PCT");
				query.append("			, MANAGER_ID");
				query.append("			, DEPARTMENT_ID");
				query.append(" FROM		 EMPLOYEES");
				return query.toString();
			}
			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				return employeesVO;
			}
		});
	}

	@Override
	public EmployeesVO findOneEmployee(int employeeId) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";

		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");

			// 스트링은 불변, 스트링버퍼는 가변.
			StringBuffer query = new StringBuffer();
			query.append(" SELECT    EMPLOYEE_ID");
			query.append(" 			 ,FIRST_NAME");
			query.append(" 			 ,LAST_NAME");
			query.append(" 			 ,EMAIL");
			query.append(" 			 ,PHONE_NUMBER");
			query.append(" 			 ,JOB_ID");
			query.append(" 			 ,HIRE_DATE");
			query.append(" 			 ,SALARY");
			query.append(" 			 ,COMMISSION_PCT");
			query.append(" 			 ,MANAGER_ID");
			query.append(" 			 ,DEPARTMENT_ID");
			query.append(" FROM		  EMPLOYEES ");
			query.append(" WHERE	  EMPLOYEE_ID = ? ");

			// prepareStatment가 원하는건 스트링타입이기 때문에 현재 스트링버퍼로 작성한 것을 toString으로 형
			// 변환.
			stmt = conn.prepareStatement(query.toString());
			// 배열과 리스트만 0번부터 시작 나머지는 무조껀 1
			stmt.setInt(1, employeeId);

			rs = stmt.executeQuery();
			EmployeesVO employeesVO = null;
			if (rs.next()) {
				employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);

			}
			return employeesVO;

		} catch (SQLException e) {
			e.printStackTrace();
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
	public List<EmployeesVO> getAllEmployeesWithJobs() {
		return null;
	}

}
