
public class MultipleArrayTwo {

	public static void main(String[] args) {

		int[][] numbers = {
				{ 2, 4, 6, 8, 10, 12, 14, 16, 18 }, 
				{ 3, 6, 9, 12, 15, 18, 21, 24, 27 },
				{ 4, 8, 12, 16, 20, 24, 28, 32, 36 }

		};

		System.out.println(numbers[0][0]);
		System.out.println(numbers[0][1]);
		System.out.println(numbers[0][2]);

		System.out.println(numbers[1][0]);
		System.out.println(numbers[1][1]);
		System.out.println(numbers[1][2]);

		System.out.println(numbers[2][0]);
		System.out.println(numbers[2][1]);
		System.out.println(numbers[2][2]);

		int i = 0;
		int j = 0;

		// 1. 행의 개수를 가져와 변수에 담는다.
		int rowCount = numbers.length;

		// 2. 행의 개수 만큼 i를 증가시키며 반복한다.
		while (i < rowCount) {
			// 3. i 번째 행의 배열 원소 개수를 가져와 변수에 담는다.
			int colCount = numbers[i].length;
			// 4. i 번째 행의 배열 원소 개수 만큼 j를 증가시키며 반복한다.
			while(j < colCount) {
				
				System.out.println(numbers[i][j]);				
				j++;
								
			}
			
			i++;

		}

	}

}
