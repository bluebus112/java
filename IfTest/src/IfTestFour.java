
public class IfTestFour {
	
	public static void main(String[] args) {
		
		/*
		 * 현금이 없고 신용카드가 있을 경우
		 * "신용카드로 결제합니다." 를 출력하는 프로그램
		 */
		
		// 있다 = ture
		// 없다 = false 로 표현함
		
		// 현금이 없다.
		boolean hasCash = false;
		
		// 신용카드가 있다.
		boolean hasCreditCard = true;
		
		// 현금이 없고 신용카드가 있는지 확인한다.
		boolean noCashHasCredit = hasCash == false && hasCreditCard == true;
		boolean isCard = !hasCash && hasCreditCard; // true
		
		// 현금이 없다고 신용카드가 있다면 " 신용카드로 결제합니다" 를 출력한다.
		// 실무에서는 조건절을 if문에 바로 넣는다.
		if ( isCard ) {
			System.out.println("신용카드로 결제합니다.");
		}
		
		
		
		
	}

}
