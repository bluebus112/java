package com.ktds.jjh.vo;

import java.util.List;

import com.ktds.jjh.dao.support.annotations.Types;

public class DepartmentVO {
	
	@Types
	private int departmentId;
	@Types
	private int managerId;
	@Types
	private int locationId;
	@Types
	private String departmentName;
	@Types
	private LocationVO locationVO;
	
	

	public LocationVO getLocationVO() {
		
		if( locationVO == null){
			locationVO = new LocationVO();
		}
		return locationVO;
	}

	public void setLocationVO(LocationVO locationVO) {
		this.locationVO = locationVO;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
