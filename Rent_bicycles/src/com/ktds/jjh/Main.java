package com.ktds.jjh;

import com.ktds.jjh.customs.Customs;
import com.ktds.jjh.rentstore.RentStore;

public class Main {

	public static void main(String[] args) {

		RentStore rentStore = new RentStore();
		rentStore.setBicycles(100);
		rentStore.setMoney(50000);
		rentStore.setPRICE(5000);

		Customs customs = new Customs(2, 10000, "James");
		
		rentStore.rent(customs);

		System.out.println("===============자전거 대여점 현황============");
		System.out.println("자전거 보유 대수 : " + rentStore.getBicycles());
		System.out.println("대여료 총 합 : " + rentStore.getMoney());
		System.out.println("============================================");
		
		System.out.println("================대여자 현황==================");
		System.out.println("대여자 이름"+ customs.getCustomName());
		System.out.println("자전거 보유 수 : " + customs.getUseBicycles());
		System.out.println("보유 금액 : " + customs.getMoney());
		System.out.println("============================================");

	}

}
