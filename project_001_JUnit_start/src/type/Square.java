package type;

public class Square {

	/** Function: receives an int and returns the product of itself */
	public int square(int x) {
		return x*x;
	}
	
	/** Function: counts the number of a char in a string */
	public int countA(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
				count++;
			}
		}	
		return count;
	}
}
