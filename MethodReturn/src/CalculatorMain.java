
public class CalculatorMain {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		calculator.printComputeResult();
		calculator.printComputeResult(10, 50);
		
		// calculator.getAndPrintMultiplicationResult(10, 7);
//		int result = calculator.getAndPrintMultiplicationResult(calculator.getAndPrintMultiplicationResult(100, 50), 7);
		int parmData = calculator.getAndPrintMultiplicationResult(100, 50);
		int result = calculator.getAndPrintMultiplicationResult(parmData, 7);
		
		String message = String.format("%d * %d = %d", 10,7,result);
		System.out.println(message);
		
		
	}

}
