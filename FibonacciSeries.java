package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range =8;
		int firstNum = 0;
		int secNum = 1;
		System.out.println(firstNum);
		for(int i=1;i<range;++i) {
			int sum = firstNum+secNum;
			System.out.println(""+sum);
			firstNum = secNum;
			secNum = sum;
			
			
		}

	}

}
