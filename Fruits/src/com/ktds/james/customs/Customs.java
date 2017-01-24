package com.ktds.james.customs;

import com.ktds.james.owner.Owner;

/**
 * Owner에게 금액을 지불하고 상품을 구매한다.
 * @author Admin
 *
 */
public class Customs {
	
	
	/**
	 * 손님의 보유 금액
	 */
	private int money;
	/*
	 * 손님이 구매한 물품의 수
	 */
	private int fruitsQuantity;
	
	
	
	/**
	 * 생성자 만들기
	 */
	public Customs(int money, int fruitsQuantity){
		System.out.println("손님을 생성합니다.");
		
		setMoney(money);
		setFruitsQuantity(fruitsQuantity);
		// 현황 출력하기
		System.out.println(this);
	}
	
	
	
	/**
	 * money의 값을 변경 할 수 있게 setter를 이용함
	 */
	public void setMoney(int money) {
		this.money = money;
	}
	/**
	 * money의 값을 참조 할 수 있게 getter를 이용함
	 */
	public int getMoney() {
		return this.money;
	}
	/**
	 * fruitsQuantity의 값을 변경 할 수 있게 setter를 이용함
	 */
	public void setFruitsQuantity(int fruitsQuantity) {
		this.fruitsQuantity = fruitsQuantity;
	}
	/**
	 * fruitsQuantity의 값을 참조 할 수 있게 getter를 이용함
	 */
	public int getfruitsQuantity(){
		return this.fruitsQuantity;
	}
	
	
	
	/**
	 * 구매하기
	 * @param owner
	 */
	public void buy(Owner owner) {
                  // 객체타입 객체명		
		owner.sell(this);
		
		this.fruitsQuantity++;
	}
	/**
	 * 지불하기
	 */
	public void pay(int money) {
		this.money-=money;
	}
	
	
	
	/**
	 * 손님의 현황 파악하기
	 */
	public String toString() {
		String message = String.format("손님의 자산 : %d, 구매 물품 수 : %d", this.money, this.fruitsQuantity);
		
		return message;
		
	}

	
}
