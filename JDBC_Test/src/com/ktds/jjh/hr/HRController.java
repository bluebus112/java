package com.ktds.jjh.hr;

import com.ktds.jjh.hr.biz.HRBiz;
import com.ktds.jjh.hr.biz.HRBizImpl;

public class HRController {

	public void start() {

		HRBiz hrBiz = new HRBizImpl();
		hrBiz.printAllEmployees();
		
		HRBiz hrBizs = new HRBizImpl();
		hrBizs.printAllDepartment();
	}
	
	

	public static void main(String[] args) {

		new HRController().start();

	}

}
