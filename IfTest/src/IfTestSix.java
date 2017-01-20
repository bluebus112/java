import java.util.Scanner;

public class IfTestSix {
	
	Scanner input = new Scanner( System.in );
	
	void ifTestSix() {
		
		System.out.println("각 과목의 점수를 입력하시오.");
		System.out.print("프로그래밍 점수 : ");
		int scorePrograming = input.nextInt();
		
		System.out.print("경영 점수 : ");
		int scoreBusinessManagement = input.nextInt();
		
		System.out.print("수학 점수 : ");
		int scoreMathmatic = input.nextInt();
		
		System.out.print("알고리즘 점수 : ");
		int scoreAlgorithm = input.nextInt();
		
		int sum = scorePrograming + scoreBusinessManagement + scoreMathmatic + scoreAlgorithm;
		double average = sum  / 4.0;
		
		System.out.println("과목 총점 : " + sum);
		System.out.println("과목 평균 : " + average);
		
		// 위 방법보다 더욱 간결하고, 보기 좋게 표현 할 수 있다.
		String message = String.format("총점은 %d, 평균은 %.2f점 입니다", sum, average);
										// 매핑하고 싶은 숫자의 포맷을 사용
		System.out.println(message);
		
		if ( average >90 ) {
			System.out.println(" 참 잘했어요.");
		}
		else{
			System.out.println("공부하세요.");
		}
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
