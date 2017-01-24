
public class ArmyMain {
	
	public static void main(String[] args) {
		
		// 군인 객체를 만들어 주는 클래스 (객체).
		Army army = new Army();
		
		
		Person jjh = army.makeArmy("정지호");
		System.out.println(jjh.getName());
		System.out.println(jjh.getJob());
		
		Person kkk = army.makeArmy("James");
		System.out.println(kkk.getName());
		System.out.println(kkk.getJob());
		
	}

}
