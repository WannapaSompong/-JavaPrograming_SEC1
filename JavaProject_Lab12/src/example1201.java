import java.util.Scanner;
import java.io.*;
public class example1201 {

	public static void main(String[] args) throws IOException{
		Scanner readFile = new Scanner(new File("D:\\txtFile\\MemberLogin.txt"));
		
		while(readFile.hasNext()) {
			String fname = readFile.next();
			readFile.next();
			readFile.next();
			String email = readFile.next().toUpperCase();
			System.out.print(fname+" "+"("+email+")");
			
		}
		readFile.close();
	}

}
