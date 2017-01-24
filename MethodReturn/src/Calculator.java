
public class Calculator {
	
	public void printComputetResult() {
		int result = 1 + 1;
		System.out.println(result);
	}
	
	/**
	 * printComputeResult method over loading
	 * 메소드의 이름은 같지만 파라미터의 종류나 개수가 다른 메소드.
	 * @param numberOne
	 * @param numberTwo
	 */
	
	public void printComputeTesult(int numberOne, int numberTwo) {
		int result = numberOne + numberTwo;
		System.out.println(result);
		
	}

}
