package com.ktds.james;

import com.ktds.james.customs.Customs;
import com.ktds.james.owner.Owner;

public class FruitsMain {
	
	public void start() {
		
		Customs james = new Customs(100000, 0);
		Customs hans = new Customs(100000, 0);
		
		Owner petter = new Owner(0, 500);
		Owner jessica = new Owner(0, 500);
		
		james.buy(petter);
		
		hans.buy(jessica);
		
		System.out.println(james);
		System.out.println(petter);
		
		
		
	}

	public static void main(String[] args) {
		new FruitsMain().start();
	}
}
