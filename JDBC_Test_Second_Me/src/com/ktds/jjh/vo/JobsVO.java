package com.ktds.jjh.vo;

import com.ktds.jjh.dao.support.annotations.Types;

public class JobsVO {
	
	@Types
	private String jobId;
	@Types
	private String jobTitle;
	@Types
	private int minSalary;
	@Types
	private int maxSalary;
	
	
	
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}
	public int getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}
	
	
	
	
	

}
