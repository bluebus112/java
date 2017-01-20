import java.util.Scanner;

public class IfTestTen {

	Scanner input = new Scanner(System.in);

	void ifTestTen() {

		System.out.println("세 가지 숫자를 입력하시오.");

		System.out.print("첫번째 : ");
		int numberOne = input.nextInt();

		System.out.print("두번째 : ");
		int numberTwo = input.nextInt();

		System.out.print("세번째 : ");
		int numberThree = input.nextInt();

		int bigNumber = 0;

		if (numberOne > numberTwo) {
			bigNumber = numberOne;
		} else {
			bigNumber = numberTwo;
		}
		if (numberThree > bigNumber) {
			bigNumber = numberThree;
		}
		System.out.printf("%d, %d, %d 중 가장 큰 수는 %d 입니다.", numberOne, numberTwo, numberThree, bigNumber);

	}

}
