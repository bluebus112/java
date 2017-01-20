import java.util.Scanner;

/**
 * 
 * 
 * <pre>
 * 3과목 (경영, 수학, 프로그래밍)</br>
 * 점수의 총점과 평균, 학점을 출력해보세요</br>
 * <학점></br>
 * A : 100~90</br>
 * B : 89~80</br>
 * C : 79~70</br>
 * D : 69~60</br>
 * F : 59~0</br>
 * 
 * <pre>
 * 
 * @author James Jung (bluebus4727@gmail.com)
 */
public class IfTestEight {

	Scanner input = new Scanner(System.in);

	void ifTestEight() {

		System.out.println("과목의 점수를 입력하시오.");

		System.out.print("경영 : ");
		int businessManagement = input.nextInt();

		System.out.print("수학 : ");
		int mathmticth = input.nextInt();

		System.out.print("프로그래밍 : ");
		int programing = input.nextInt();

		int sum = businessManagement + mathmticth + programing;
		double average = sum / 3.0;

		// System.out.println("과목 총점 : " + sum);
		// System.out.println("과목 평균 : " + average);

		String message = String.format("과목 총점 %d, 평균 %.2f ", sum, average);
		System.out.println(message);

		if (average >= 90) {
			System.out.println("학점 : A");
		} else if (average >= 80) {
			System.out.println("학점 : B");
		} else if (average >= 70) {
			System.out.println("학점 : C");
		} else if (average >= 60) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점: F");
		}
	}

}
