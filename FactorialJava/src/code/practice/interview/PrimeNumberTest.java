package code.practice.interview;

public class PrimeNumberTest {

	public static void main(String[] args) {
		System.out.println("Starts Prime Number Projects !");
		int count=0;
		for(int i=2;i<100;i++) {
			boolean primeNum = isPrimeNumber(i);
			if(primeNum) {
				count++;
				System.out.println("Prime Number : "+i);
			}
		}
		
		System.out.println("Total Number of Prime number "+count);
		
		int[] arr= {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		System.out.println("-----------"+arr.length);
	}
	
	public static boolean isPrimeNumber(int num) {
		boolean flag=true;
		for(int i=2; i <= num/2 ; i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	
}
