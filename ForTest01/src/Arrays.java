import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Arrays {
	
	public static void main(String[] args) {
		
		
		String[] names={ "강소라", "크리샤 츄", "샤넌" };
		//출력
		//정수형 변수 i는 0부터 시작해 names의 개수보다 적을 때까지 1씩 증가하며 반복한다.
		// for 괄호 안에 것들은 지역변수 이므로 다른 메소드에서 사용할 수 있다.
		for(int i = 0; i < names.length; i++){
			System.out.println(i);
			System.out.println(names[i]);
			
		}
		
		
		int[] scores = {10,20,30,40,50,60,70,80,90,100};
		//합계 계산 후 출력
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("현재 i의 값 : " + i);
			System.out.println("i 번째 원소의 값 : " + scores[i] );
			sum = sum + scores[i];
			System.out.println("현재까지 점수 총 합 : " + sum );
			
		}
		
		System.out.println("최정 점수 총 합 : " + sum );
		
		
		// foreach
		// for를 간편하게 사용하기 위한 방법
		// 배열 요소를 순차로 꺼내어 준다.
		// 매우 빠르다.
		// for 보다 빠르다
		
		for ( int score : scores ) {
			//System.out.println(scores[score]);
			System.out.println(score);
		}
				
	}

}
