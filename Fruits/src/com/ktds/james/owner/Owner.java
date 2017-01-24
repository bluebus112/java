package com.ktds.james.owner;

import com.ktds.james.customs.Customs;

public class Owner {
	
	
	/**
	 * 상품의 가격 정의
	 */
	private final int PRICE = 5000;
	/*
	 * 주인의 가진 금액
	 */
	private int money;
	/*
	 * 주인의 상품 수
	 */
	private int itemsQuantity;
	
	
	
	/**
	 * 생성자 만들기-값을 초기화
	 */
	public Owner(int money, int itemsQuantity) {
		System.out.println("상점 주인을 생성합니다.");
		
		setMoney(money);
		setItemsQuantity(itemsQuantity);
		
		System.out.println(this);		
	}
	
	
	
	/*
	 * private money의 값을 변경 할 수 있게 setter를 이용.
	 */
	public void setMoney(int money) {
		this.money = money;
	}
	/*
	 * private money의 값을 참조 할 수 있게 getter를 이용
	 */
	public int getMoney() {
		return this.money;
	}
	
	/*
	 * private itemsQuantity의 값을 변경 할 수 있게 setter를 이용.
	 */
	public void setItemsQuantity(int itemsQuantity) {
		this.itemsQuantity = itemsQuantity;
	}
	/*
	 * private itemsQuantity의 값을 참조 할 수 있게 getter를 이용.
	 */
	public int getItemsQuantity() {
		return this.itemsQuantity;
		
	}

	
	
	/**
	 * 판매하기
	 */
	public void sell(Customs customs) {
		// itemsQuantity에서 하나를 빼기.
		this.itemsQuantity--;
		//손님 물건 값 지불
		customs.pay(PRICE);
		//주인의 자산 증가
		this.money += PRICE;
		
	}
	/*
	 * 재고파악하기
	 */
	public boolean isRemain() {
		boolean isRemain = this.itemsQuantity == 0;
		return isRemain;
	}
	
	
	
	/*
	 * 주인의 현황 파악하기
	 */
	@Override
	public String toString() {
		String message = String.format("주인의 자산 : %d, 상품의 수 : %d", this.money, this.itemsQuantity);
		return message;
	}
	
}

