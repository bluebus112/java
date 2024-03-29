
public class Person {

	private String name;
	private String job;

	/**
	 *  Default 생성자 Default Constructor </br>
	 * ---------------------</br>
	 * 멤버변수 값 초기화</br>
	 */
		 
	// public Person() {
	// System.out.println("Person 생성자 실행됨!");
	// name = "익명";
	// job = "알 수 없음";
	// }

	public Person() {

		System.out.println("Person 기본 생성자 생성됨");

	}

	/**
	 * 생성자 오버로딩 기본 생성자에</br>
	 * 파라미터를 추가해 데이터를 초기화 시킨다.</br>
	 * 
	 * @param name
	 * @param job
	 */
	public Person(String name, String job) {
		System.out.println("Person 생성자 실행됨!");
		setName(name);
		setJob(job);

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void introduce() {
		String message = String.format("이름 : %s, 직업 : %s", name, job);
		System.out.println(message);
	}

}
