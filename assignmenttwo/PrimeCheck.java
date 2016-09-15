package assignmenttwo;

import java.util.Scanner;

public class PrimeCheck implements Runnable {
	int number;

	public void run() {

		int count = 0;
		for (int i = 2; i <= number / 2; i++)
			if (number % i == 0) {
				count++;
				break;
			}
		if (count == 0) {
			System.out.println(number + " Number is prime");
		} else {
			System.out.println(number + " Number is not prime");
		}

	}

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			PrimeCheck p1 = new PrimeCheck();
			PrimeCheck p2 = new PrimeCheck();
			do {
				System.out.println("Enter a number to check :");
				p1.number = scan.nextInt();
				System.out.println("Enter another number to check :");
				p2.number = scan.nextInt();
				if (p1.number <= 0 || p2.number <= 0) {
					System.out
							.println("********************************************");
					System.out
							.println("Prime Number need to be a positive integer(greater than 1).Please Enter Agian.");
				}
			} while (p1.number < 1 || p2.number < 1);
			Thread t1 = new Thread(p1);
			Thread t2 = new Thread(p2);

			t2.start();
			t1.start();

		} catch (Exception e1) {
		}

	}

}
