import java.util.ArrayList;
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int sum = 5;
		int count = 0;
		ArrayList al = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Enter the number till which the prime numbers are to be calculated: ");
		int input = scanner.nextInt();
		int count1 = 0;
		Integer[] A = {0};
		// loop through the numbers one by one
		for (int i = 2; i < input; i++) {

			boolean isPrimeNumber = true;

			// check to see if the number is prime
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break; // exit the inner for loop
				}
			}

			// print the number if prime
			if (isPrimeNumber) {
				count1++;
				al.add(i);

			}

		}
		for (int a=0;a<=input;a++){
			A[a]=a;
		}
		for (int j = 5; j <= input; j = j + 2) {
			if ((A[j] != 0 && A[j] == sum) || A[j] == -1) {
				count = count + 1;
			}
			if (A[j] != 0 || A[j] == -1) {
				sum = sum + j;
			}
			if (A[sum] != 0) {
				// if A[sum] is prime
				A[sum] = -1; // mark A[sum] as sum of consecutive
			}
		}
		System.out.println(al + "Count: " + count1);
		System.out.println("the no of consecetive prime nos are " + count);
	}
}