package com.ktds.jjh.customs;

import com.ktds.jjh.rentstore.RentStore;

public class Customs {

	private int useBicycles;
	private int money;
	private String customName;

	public Customs(int useBicycles, int money, String customName) {
		//super();
		this.useBicycles = useBicycles;
		this.money = money;
		this.customName = customName;
	}

	public void setUseBicycles(int useBicycles) {
		this.useBicycles = useBicycles;
	}

	public int getUseBicycles() {
		return useBicycles;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public String getCustomName() {
		return customName;
	}
	
	public void pay( RentStore rentStore ){
		
		//money = useBicycles;
		
		this.money -= (useBicycles*rentStore.getPRICE());
		
	}

}
