package com.ktds.james;

import com.ktds.james.customs.Customs;
import com.ktds.james.owner.Owner;

public class FruitsMain {
	
	public void start() {
		
		Customs james = new Customs(0, 10000);
		Owner petter = new Owner(6, 10000000);
		
		james.buy(petter);
		
		System.out.println(james);
		System.out.println(petter);
		
		
		
	}

}
