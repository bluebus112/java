package com.ktds.jjh.hr.vo;

import com.ktds.jjh.dao.support.annotations.Types;

public class EmployeesVO {

	/**
	 * 컬럼명을 변수명에 맞춰 작성 겟터 셋터 생성 vo작성 완료
	 */
	@Types
	private int employeeId;
	
	@Types
	private String firstName;
	
	@Types
	private String lastName;
	
	@Types
	private String email;
	
	@Types
	private String phoneNumber;
	
	@Types
	private String hireDate;
	
	@Types
	private String jobId;
	
	@Types
	private int salary;
	
	@Types
	private double commissionPct;
	
	@Types
	private int managerId;
	
	// 알리아스를 구분하기 위해 추가로 설정을 해준다. 
	@Types(alias = "D_DEPARTMENT_ID")
	private int departmentId;
	
	private JobsVO jobs;
	// private RegionsVO regionsVO;
	private CountriesVO contriesVO;
	
	private DepartmentVO departmentVO;


	public DepartmentVO getDepartmentVO() {
		
		if( departmentVO == null) {
			departmentVO = new DepartmentVO();
		}
		return departmentVO;
	}

	public void setDepartmentVO(DepartmentVO departmentVO) {
		this.departmentVO = departmentVO;
	}

	public CountriesVO getContriesVO() {

		if (contriesVO == null) {
			contriesVO = new CountriesVO();
		}
		return contriesVO;
	}

	public void setContriesVO(CountriesVO contriesVO) {
		this.contriesVO = contriesVO;
	}

	public JobsVO getJobs() {
		if (jobs == null) {
			jobs = new JobsVO();
		}
		return jobs;
	}

	public void setJobs(JobsVO jobs) {
		this.jobs = jobs;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(double commissionPct) {
		this.commissionPct = commissionPct;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

}
