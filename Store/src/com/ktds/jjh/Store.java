package com.ktds.jjh;

import com.ktds.jjh.buyer.Buyer;
import com.ktds.jjh.seller.Seller;


public class Store {
	
	public void start() {
		
		Buyer lyj = new Buyer(0, 500000);
		Seller nym = new Seller(500,500000);
		
		lyj.buy(nym);
		
		System.out.println(lyj);
		System.out.println(nym);
		
//		Buyer ljs = new Buyer(0, 50000000);
//		Buyer jgu = new Buyer(0, 40000000);
//		
//		ljs.buy();
//		
//		System.out.println(ljs);
//		System.out.println(jgu);
		
		
		
//		System.out.println("장터에 오신 것을 환영합니다.");
//		Buyer kkk = new Buyer(0, 500000);
//		Seller jjh = new Seller(100,5000000);
//		
//		System.out.println("바이어 : 상품 좀 살게요. 이 상품 1개 주세요.");
//		jjh.sell();
//		kkk.buy();
//		
//		System.out.println("셀러 : 2500원 입니다.");
//		kkk.pay(2500);
//		
//		System.out.println(jjh);
//		System.out.println(kkk);
		
		
	}
	
	public static void main(String[] args) {
		new Store().start();
		
		
		// Buyer import 하기.
//		Buyer jjh = new Buyer(0,100000);
//		
//		jjh.buy();
//		jjh.pay(2000);
//		
//		System.out.println(jjh);
//		
//		Seller kkk = new Seller(100, 10000);
//		
//		kkk.sell();
//		boolean isSoldOut = kkk.isSoldOut();
//		System.out.println(isSoldOut);
//		
//		System.out.println(kkk);
	}

}
