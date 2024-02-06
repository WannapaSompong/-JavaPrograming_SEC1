import java.io.*;
public class Lab1201 {

	public static void main(String[] args) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("D:\\txtFile\\MemberLogin.txt"));
		String tmp = "";
		
		while((tmp=readFile.readLine()) !=null) {
			String[] data = tmp.split("\t");
			
			String lastName = data[1].substring(0,1);
			String firstName = data[0];
			String email = data[3];

			
			System.out.println(lastName+"."+firstName+" ("+email.toUpperCase()+")");
			
		}
		readFile.close();
	}

}
