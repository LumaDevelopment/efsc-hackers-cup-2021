import java.util.Scanner;

/**
 * Problem 2
 * Eastern Florida State College
 * 2021 Hacker's Cup
 * 
 * @author Luma Development
 * @version 11/5/2021
 *
 */

public class primed {

	/**
	 * There is likely a better way to do this,
	 * but this worked for the purposes of
	 * the competition.
	 */

	static boolean isPrime(int input) {

		boolean prime = true;
		
		//range devised from problem specifications
		for(int i = 2; i < 10001; i++) {

			if((input % i) == 0) {

				//Make sure that this isn't the same number plugged in
				if(input != i) {
					prime = false;
					break;
				}

			}

		}
		
		return prime;

	}
	
	/**
	 * Alternates between checking the prime of input +/- count.
	 */

	static int closestPrime(int input) {

		boolean foundIt = false;
		int count = 1;
		
		while(!foundIt) {

			if(isPrime(input - count) || isPrime(input + count)) {
				foundIt = true;
			}else {
				count++;
			}

		}
		
		return count;

	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is your number? ");
		Integer input = Integer.valueOf(scan.nextLine());
		
		if(isPrime(input)) {
			System.out.println("Primed!");
		}else {
			System.out.println("Missed by " + closestPrime(input));
		}
		
		scan.close();
		
	}
	
}
