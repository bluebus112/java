
public class Arrays {
	
	public static void main(String[] args) {
		
		
		// 배열 안에 있는 모든 원소를 출력한다.
		
		// 1. 배열을 정의하고 값을 할당한다.
		String[] names={ "강소라", "크리샤 츄", "샤넌" };
		
		// 2. 배열의 원소 개수를 변수에 담아 보관한다.
		int nameCount = names.length;
		
		// 3. 배열의 원소 개수만큼 반복하며, 각 원소를 출력한다.
		// 3-1. 반복값을 정의하고, 0으로 초기화한다.
		int i =0;
		
		// 3-2. while 반복문을 이용한다.
		// 3-2. 조건은 반복값이 nameCount 보다 작을 때까지만으로 한다.
		while(i<nameCount){
			// 3-3. 반복 구문 : names 배열의 원소를 꺼내 출력한다.
			// names[0] names[1] names[2]
			System.out.println(names[i]);
			
			// 3-4. 반복 값을 증가시킨다.
			i++;
					
		}
		
//		int sum = 0;
//		while( Condition) {
//			
//			sum += 배열 원소;
//		}
		
		
	}

}
