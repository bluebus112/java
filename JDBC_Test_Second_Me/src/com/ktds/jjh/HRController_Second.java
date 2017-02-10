package com.ktds.jjh;

import com.ktds.jjh.biz.HRBiz;
import com.ktds.jjh.biz.HRBizImpl;

public class HRController_Second {
	
	HRBiz hrBizs = new HRBizImpl();
	
	public void start() {
	
		hrBizs.printAllEmployeesWithDepartmentWithJobs();
		
		
		
	}
	
	public static void main(String[] args) {
		new HRController_Second().start();
	}

}
