// 0 1 1 2 3 5 8 13 21 34


package FibonacciSeries;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0; int n2 =1; int sum = 0;
		//System.out.println(n1+ " "+n2);
		for (int i=0;i<10;i++) {
			
			sum=n1+n2;  //1
			
			System.out.println("" +sum);
			n1=n2;
			n2=sum;
			
			
		}
		
		
		
	}

}
