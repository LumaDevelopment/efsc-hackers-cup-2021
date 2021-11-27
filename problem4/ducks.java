import java.util.HashMap;
import java.util.Scanner;

/**
 * Problem 4
 * Eastern Florida State College
 * 2021 Hacker's Cup
 * 
 * @author Luma Development
 * @version 11/5/2021
 *
 */

public class ducks {

	static boolean anyDucksLeft(boolean[] alive) {

		boolean anyAlive = false;
		
		for(int i = 0; i < alive.length; i++) {
			if(alive[i]) {
				anyAlive = true;
				break;
			}
		}
		
		return anyAlive;

	}
	
	public static void main(String[] args) {
		
		boolean validInput = false;
		Scanner scan = new Scanner(System.in);
		
		//probably could've used better var names, woops!
		int duckCount = -1;
		int alliCount = -1;
		
		//place is the alligator's current position
		int place = 0;

		//count tracks the order of duck death
		int count = 0;
		
		String deathOrder = "";
		
		while(!validInput) {

			System.out.print("How many ducks are there (n)? ");
			duckCount = Integer.valueOf(scan.nextLine());
			
			System.out.print("At what interval does the alligator count (m)? ");
			alliCount = Integer.valueOf(scan.nextLine());
			
			if(duckCount > 0 && duckCount < 101 && alliCount > 0 && alliCount < 101) {
				validInput = true;
			}

		}
		
		boolean[] alive = new boolean[duckCount];
		HashMap<Integer, Integer> deathMap = new HashMap<Integer, Integer>();
		
		//initialize the alive array
		for(int i = 0; i < duckCount; i++) {
			alive[i] = true;
		}
		
		while(anyDucksLeft(alive)) {
			
			int placesLeftToMove = alliCount;
			
			while(placesLeftToMove > 0) {
				
				place++;
				
				//alligator position wraparound
				if(place > (duckCount)) {
					place -= duckCount;
				}
				
				//if duck is dead, move on without reducing the places moved
				if(alive[place-1]) {
					placesLeftToMove--;
				}

			}
			
			//set duck as dead
			alive[place - 1] = false;

			//increase dead duck count by 1
			count++;

			//record death
			deathMap.put(place-1, count);
			
		}
		
		for(int i = 0; i < duckCount; i++) {
			deathOrder += deathMap.get(i) + " ";
		}
		
		System.out.println(deathOrder);
		
		scan.close();
		
	}
	
}
