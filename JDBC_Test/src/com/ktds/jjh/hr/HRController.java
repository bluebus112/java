package com.ktds.jjh.hr;

import com.ktds.jjh.hr.biz.HRBiz;
import com.ktds.jjh.hr.biz.HRBizImpl;

public class HRController {

	HRBiz hrBizs = new HRBizImpl();

	public void start() {
		hrBizs.findOneEmployees(125);
	}
	
	public void startTwo() {
		hrBizs.printAllEmployees();
	}

	public static void main(String[] args) {

		//new HRController().start();
		new HRController().startTwo();

	}

}
