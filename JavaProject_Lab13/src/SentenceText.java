import java.util.*;
import java.io.*;
public class SentenceText {

	public static void main(String[] args) throws IOException {
		//create object for write data to file
		PrintStream writeFile = new PrintStream((new File("D:\\textFile\\ATMBookBank.txt")));
		
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		while(true) {
			System.out.print("Sentence : ");
			String word = input.next().toUpperCase();
		
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
		
			writeFile.println(i+":"+word);
			i++;
		}
		
		System.out.println("File is save!!");
		writeFile.close();
	}

}
