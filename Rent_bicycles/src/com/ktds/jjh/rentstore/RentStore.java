package com.ktds.jjh.rentstore;

import com.ktds.jjh.customs.Customs;

public class RentStore {

	private int bicycles;
	private int money;
	private int PRICE;
	
	

//	public RentStore(int bicycles, int money) {
//	//	super();
//		this.bicycles = bicycles;
//		this.money = money;
//	}

	public void setBicycles(int bicycles) {
		this.bicycles = bicycles;
	}
	public int getBicycles() {
		return bicycles;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	
	public void setPRICE(int pRICE) {
		PRICE = pRICE;
	}
	public int getPRICE() {
		return PRICE;
	}
	
	public void rent(Customs customs){
		
		this.bicycles -= customs.getUseBicycles();
		
		//System.out.println(this);
		customs.pay(this);
		
		this.money +=(PRICE * customs.getUseBicycles());
		
	}

}
