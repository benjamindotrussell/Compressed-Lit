import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/*
 * TCSS 342 - Compressed Literature
 */
/**
 * Driver class for the Compressed Literature program.
 * @author Ben Russell
 * @version 1.0  -  4/30/2016 
 */
public class Main {
	static String book;
	static String codes;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long lStartTime = new Date().getTime();//time at start of  program
		readFile();
		CodingTree ct = new CodingTree(book);
		
		writeFile(); 
		
		long lEndTime = new Date().getTime();//time at end of  program
		long difference = lEndTime - lStartTime;//program run time
		System.out.println("Run time: " + difference + " milliseconds");
	}
	/**
	 * writes a text file. currently just writes what is in the field 'book'
	 * but later I will use it to write the codes text file and the 
	 * compressed binary file.
	 */
	private static void writeFile() {
		String fileName = "OutputFile.txt";
		try {
			FileWriter file = new FileWriter(fileName);
			 
			BufferedWriter buffer = new BufferedWriter(file);
			buffer.write(book);
			buffer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	/**
	 * This method was brought to you by the nice people at caveofprogramming.com.
	 * caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html
	 * 
	 * reads a file in and converts it to a String and puts it in the field 'book'.
	 * @author John Purcell, Ben Russell
	 * @modified 05/01/2016
	 */
	public static void readFile() {
		//String fileName = "testFile.txt";
        String fileName = "WarAndPeace.txt";
        //String fileName = "TreasureIsland.txt";
        StringBuffer buffer = new StringBuffer();
        String line = null;
        try {
            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            // read each line into the StringBuffer.
            while((line = bufferedReader.readLine()) != null) {
            	buffer.append(line);
            	buffer.append("\n");
            }

            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
        }
        book = buffer.toString();
        
	}
	void testCodingTree() {
		
	}
	
}
