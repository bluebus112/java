
public class WhileToFor {

	public static void main(String[] args) {

		// while 기본 형식
		// 1 부터 10까지 출력

		int i = 0;
		while (i < 10) {
			i++;
			System.out.println(i);
		}

		// for 기본 형식
		// 1 부터 10 까지 출력
		// 초기화식, 조건식, 증감식
		for (int j = 0; j < 10; j++) {
			// 반복 구간

			System.out.println(j + 1);

			// 순서: int j=0 -> j<10 -> 출력 -> j++
		}

	}

}
