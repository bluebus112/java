import java.util.Scanner;

public class IfTestNine {

	Scanner input = new Scanner(System.in);

	void ifTestNine() {

		while(true){
		System.out.println("지금 날씨는 어떤가요?..");
		System.out.println("해당되는 날씨의 번호를 고르시오.");
		System.out.println("1. 비가 오고 있습니다.");
		System.out.println("2. 맑은 날씨 입니다.");
		System.out.println("3. 종료.");
		System.out.print("번호 입력 : ");

		int number = input.nextInt();

		if (number == 1) {
			System.out.println("우산을 챙겨가세요.");
		} else if (number == 2) {
			System.out.println("우산은 필요 없습니다.");
		} else if (number == 3) {
			break;
		}

	}
	}
	// for (int i = 0; i < 3; i++) {
	// System.out.println("지금 날씨는 어떤가요?..");
	// System.out.println("해당되는 날씨의 번호를 고르시오.");
	// System.out.println("1. 비가 오고 있습니다.");
	// System.out.println("2. 맑은 날씨 입니다.");
	// System.out.print("번호 입력 : ");
	//
	// int number = input.nextInt();
	//
	// if (number == 1) {
	// System.out.println("우산을 챙겨가세요.");
	//
	// } else if (number == 2 ) {
	// System.out.println("우산은 필요 없습니다.");
	// for, while 반목문을 즉시 종료시키는 키워드
	// break;
	// }
	// }
}
