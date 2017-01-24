
public class PersonMain {
	
	public static void main(String[] args) {
		
		Person kkk = new Person();
		kkk.setName("정지호");
		kkk.setJob("프로그래머");
		kkk.introduce();
		
		Person james = new Person();
		james.setName("정지호");
		james.setJob("재벌");
		james.introduce();
		
		Person unknown = new Person();
		unknown.introduce();
		
     // 객체생성시 괄호의 데이터를 넘겨주어 생성하게 할 수 있다.
		Person ksk = new Person("김슬기", "감독");
		ksk.introduce();
	
		
	}

}
