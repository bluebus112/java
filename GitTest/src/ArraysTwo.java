
public class ArraysTwo {
	
	public static void main(String[] args){
		
		int[] scores = {10,20,30,40,50,60,70,80,90,100};
		int scoresCount = scores.length;
		
				
		int i = 0;
		int sum = 0;
		while(i <scoresCount ) {
			sum += scores[i];
			i++;
		}
		
		System.out.println("총점은 " + sum);
				
	}

}
