
public class IfTest {

	public static void main(String[] args) {

		/*
		 * 주머니에 돈이 1200원 이상 있다면, 캔커피를 살 수있습니다. 를 출력하는 프로그램
		 * 
		 */

		// 주머니에 있는 돈을 설정함.
		int moneyInPocket = 1200;

		// 주머니에 돈이 1200원 이상인지 확인함.
		// boolean isOver1200 = moneyInPocket >= 1200; //true
		// if ( isOver1200 == true ) {}
		// boodlean 타입이 올때는 뒤에 '== true'는 생략 가능

		boolean isOver1200 = moneyInPocket >= 1200; // false
		if (isOver1200) {
			// 실행되지 않는다... isOver1200이 false이기 때문데...
			// 1200원 이상이라면 "캔커피를 살 수 있습니다."를 출력함.
			System.out.println("캔커피를 살 수 있습니다.");
		}
		
		
		int ageAdult = 19;
		boolean isTeenager = ageAdult < 20;
		if ( isTeenager ) {
			
			System.out.println("술집에 입장 할 수 없습니다.");
		}

	}

}
