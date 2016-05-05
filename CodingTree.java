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
	private PriorityQueue<Node> pQue;
	private MyPriorityQueue myQue;
	private int charCount;
	public CodingTree(String message) {
		
            myBook = message;
	    pQue = new PriorityQueue<Node>();
	    iterate(myBook);
//              test the que 		
//		for (int i = 0; i < pQue.size(); i++) {
//			
//			System.out.println(pQue.poll().myWeight);
//		}
		
	}
	/** 
	 * go through each char in the message and count the occurrences of each.
	 * Create a tree for each char and add it to the priority queue.
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
				Node n = new Node(myBook.charAt(i), charCount);
				pQue.add(n);
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
	/** 
	 * inner class.
	 * @author Ben Russell
	 */
	private class Node implements Comparable<Node>{
       
		public char myChar;
        	public int myWeight;
        
        	public Node myRight;
        	public Node myLeft;
        	public Node(char c, int weight) {
        	
            	myChar = c;
         	myWeight = weight;
        }
        /**
         * allows the Node class to be compared by weight. 
         */
        @Override
        public int compareTo(Node other) {            
			if (this.myWeight < other.myWeight){
				return -1;
			} else {
				return 1;
			}
			
        }
    }
}
