
public class IfTestEleven {

	void ifTestEleven() {
		// i=i+2;
		for (int i = 2; i < 101; i = i + 2) {
			System.out.println(i);
		}
		/*
		 * 1 부터 100 사이에 존재하는 모든 짝수를 출력하기.
		 */
		// 1. 1 부터 100 까지 반복 한다.
		for (int i = 1; i < 101; i++) {

			// 2. i 값이 짝수인지 확인한다.
			if (i % 2 == 0) {
				System.out.println(i);
			}
			// 3. i 값이 짝수라면 출력한다.
		}

		// 1. 1 부터 100까지 반복한다.
		for (int j = 1; j < 101; j++) {
			// 2. i 값이 홀수인지 확인한다.
			if (j % 2 == 1) {
				// contiune는 for, while문의 처음으로 돌려보낸다.(사용빈도 매우 저음)
				// j 값이 홀수라면 반목을 건너 뛴다.
				continue; // for, while에만 사용 가능하다.

			}
			System.out.println(j);
		}
	}
}
