import java.util.HashMap;
import java.util.Scanner;

/**
 * Problem 3
 * Eastern Florida State College
 * 2021 Hacker's Cup
 * 
 * @author Luma Development
 * @version 11/5/2021
 *
 */

public class partners {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean validInput = false;
		String word = "";
		
		while(!validInput) {

			System.out.print("What is your word? ");
			word = scan.nextLine();
			
			//question specifications
			if(word.length() > 1 && word.length() < 53) {
				validInput = true;
			}

		}
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//records the amount of times a letter shows up
		for(int i = 0; i < word.length(); i++) {

			String letter = String.valueOf(word.charAt(i));
			
			//the input is always lowercase, but this could've been handled with .toLowerCase()
			if(map.keySet().contains(letter)) {

				int count = map.get(letter);
				map.remove(letter);
				count++;
				map.put(letter, count);

			}else {

				map.put(letter, 1);

			}
			
		}
		
		boolean partnerWord = true;
		
		for(int i = 0; i < map.keySet().size(); i++) {

			if(map.get(map.keySet().toArray()[i]) != 2) {

				partnerWord = false;
				break;

			}

		}
		
		if(partnerWord) {

			System.out.println("Yes");

		}else {

			System.out.println("No");
			
		}
		
		scan.close();
		
	}

}
