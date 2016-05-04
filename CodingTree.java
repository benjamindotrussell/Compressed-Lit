/*
 * TCSS 342 - Compressed Literature
 */
import java.util.Map;
import java.util.PriorityQueue;
/**
 * 
 * @author Ben Russell
 * @version 1.0  -  4/30/2016 
 */
public class CodingTree {
	/** String containing the entire book. */
	private String myBook;
	private Map<Character, String> codes;
	private String bits;
	private PriorityQueue pQue;
	private MyPriorityQueue myQue;
	private int charCount;
	public CodingTree(String message) {
		myBook = message;
		iterate(myBook);
	}
	/** 
	 * go through each char in the message and count the occurrences of each.
	 * @param book the message
	 */
	private void iterate(String book) {
		String s = "";//string to hold all of the already counted chars
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < myBook.length(); i++) {//iterate over each char in the message
			//if the char is not already counted, then count it
			if (s.indexOf(myBook.charAt(i)) == -1) {
				charCount = countChar(myBook.charAt(i));//get the char count 
				sb.append(myBook.charAt(i));//add the char to the list of counted chars
				s = sb.toString();
				//System.out.println(charCount + " " + myBook.charAt(i));// test
			}			
		}
	}
	/**
	 * count how many of a a specific char is in the message.
	 * @param c the char to count 
	 * @return the occurrences of c
	 */
	private int countChar(char c) {		
		int count = 0;
		for (int i = 0; i < myBook.length(); i++) {
			if (myBook.charAt(i) == c){
				count++;
			}
		}
		return count;		
	}
	private String decode(String bits, Map<Character, String> codes){
		
		return bits;
	}
}
