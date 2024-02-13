import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee {

	private String name,dept,answer;

	public void insert() throws IOException{
		PrintStream writeFile = new PrintStream(new File
				("D:\\\\txtFile\\\\employee.txt"));
		Scanner input = new Scanner(System.in);
		do {
			header();
			System.out.print("Enter name : ");
			name = input.next();
			System.out.print("Enter Department : ");
			dept = input.next();
			
			writeFile.println(name+"\t"+dept);
			
			System.out.print("Enter data again? : ");
			answer = input.next();
		}while(answer.equalsIgnoreCase("y"));
		
		
		
		writeFile.close();
	}

	public void header() {
		System.out.println("****************************************");
		
		
	}

	public void read()  throws IOException{
		try {
			Scanner readFile = new Scanner(new File
					("D:\\txtFile\\employee.txt"));
			boolean check = false;
			int i =0;
			int num=1;

			//System.out.print("Enter name : ");
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					header();
					System.out.println(num+") "+name);
					check = true;
					i++;
					num++;
					
				}
				
				
			}
			header();
			System.out.print("Employee in dept HR is "+i+" person.");
				if(check==false) {
					header();
					System.out.print("\nSorry,no department : "+super.getDept()+" in file.");
				}
				
			}
		catch(IOException e) {
			System.out.println("Sorry, file not found.");
		}
	}

}
