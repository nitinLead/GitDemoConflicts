package conflictDemo;


public class Fibonacci {
	public static void main(String[] args) {

		// 0 1 1 2 3 5

		int n1 = 0, n2 = 1, n3 = n1 + n2;
		int upto = 8;
		double cnt = 3;
		System.out.println(n1 + " " + n2 + " " + n3 + " ");
	
		while (cnt < upto) {
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			System.out.println(n3);
			cnt++;
		}
	}

}