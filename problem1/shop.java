import java.util.Scanner;

/**
 * Problem 1
 * Eastern Florida State College
 * 2021 Hacker's Cup
 * 
 * @author Luma Development
 * @version 11/5/2021
 *
 */

public class shop {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean inputValid = false;
		Integer items = -1;
		Integer price = -1;
		
		while(!inputValid) {
			System.out.print("Items purchased by customer: ");
			items = Integer.valueOf(in.nextLine());
			
			System.out.print("Price for one item: ");
			price = Integer.valueOf(in.nextLine());
			
			if(items > 0 && items < 101 && price > 2 && price < 51) {
				inputValid = true;
			}
		}
		
		int total = (items * price) - (2 * (items - 1));
		System.out.println("Cost is " + total);
		
		in.close();
		
	}
	
}
