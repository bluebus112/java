package com.ktds.jjh.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ktds.jjh.dao.support.JDBCDaoSupport;
import com.ktds.jjh.dao.support.QueryHandler;
import com.ktds.jjh.dao.support.annotations.BindData;
import com.ktds.jjh.vo.DepartmentVO;
import com.ktds.jjh.vo.EmployeesVO;
import com.ktds.jjh.vo.JobsVO;
import com.ktds.jjh.vo.LocationVO;
import com.sun.org.apache.bcel.internal.generic.Select;

public class HRDaoImpl extends JDBCDaoSupport implements HRDao {

	// EmployeesVO의 데이터를 List데이터에 넣어주는 메소드 작성.
	// 리턴타입을 생성한다.
	// supprot 폴더 생성 ( annotations폴더( BindData, Tyeps), JDVCDaoSupport,
	// QueryHandler)

	@Override
	public List<EmployeesVO> getAllEmpolyeesWithDepartmentWithJobs() {
		return selectList(new QueryHandler() {

			// 데이터 베이스의 쿼리를 작성 하는 메소드.
			@Override
			public String preparedQuery() {

				StringBuffer query = new StringBuffer();
				// 쿼리 덧붙이다.
				query.append(" SELECT  D.DEPARTMENT_NAME ");
				query.append("         , E.EMPLOYEE_ID ");
				query.append("         , J.JOB_TITLE ");
				query.append("         , L.CITY ");
				query.append(" FROM     EMPLOYEES E ");
				query.append("         , DEPARTMENTS D ");
				query.append("         , JOBS J ");
				query.append("         , LOCATIONS L ");
				query.append(" WHERE   E.DEPARTMENT_ID = D.DEPARTMENT_ID ");
				query.append(" AND     D.LOCATION_ID = L.LOCATION_ID ");
				query.append(" AND     E.JOB_ID = J.JOB_ID ");

				return query.toString();

			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {

			}

			// 원하는 데이터를 가져오는 메소드.
			// 모든 데이터를 employeesVO가 갖고 있기 때문에 employeesVO를 return 한다.
			@Override
			public Object getData(ResultSet rs) {

				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);

				DepartmentVO departmentsVO = employeesVO.getDepartmentVO();
				BindData.bindData(rs, departmentsVO);

				LocationVO locationVO = departmentsVO.getLocationVO();
				BindData.bindData(rs, locationVO);

				JobsVO jobsVO = employeesVO.getJobsVO();
				BindData.bindData(rs, jobsVO);

				return employeesVO;

			}

		});

	}

}
