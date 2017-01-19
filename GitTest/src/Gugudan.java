import java.util.Scanner;

public class Gugudan {

	Scanner input = new Scanner(System.in);

	// void gugudan() {
	//
	// System.out.println("============== 구구단 프로그램==============");
	// System.out.println("원하시는 구구단을 입력하세요.(입력 범위 : 2~9)");
	// System.out.print("원하는 구구단 : ");
	//
	// int j = input.nextInt();
	//
	// System.out.println("==========================================");
	// System.out.println("구구단 " + j +"단을 출력합니다.");
	//
	// int i = 0;
	// while( i < 9 ){
	// i++;
	// System.out.println(j + " X " + i + " = " + (j*i));
	// }
	//
	// }

	void starArray() {

		String str = "*";

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < 5) {

			while (j < 5) {

				System.out.print(str);
				j++;

			}

			System.out.println("");
			j = 0;

			i++;
		}

	}
}
