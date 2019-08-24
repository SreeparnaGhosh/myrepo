package factorial.withoutloop;

import java.util.Scanner;

public class FactorialWithoutLoopWithUserInput {

	public static void main(String[] args) throws Exception {

		System.out.println("Enter a number : ");
		Scanner scan = new Scanner(System.in);

		long input = scan.nextLong();
		long fact = getFactorial(input);
		System.out.println("Factorial of [" + input + "] is [" + fact + "]");
		scan.close();
	}

	private static long getFactorial(long i) {
		if (i <= 1)
			return 1;
		else
			return getFactorial(i - 1) * i;

	}

}
