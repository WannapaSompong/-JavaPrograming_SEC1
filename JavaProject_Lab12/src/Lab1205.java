import java.io.*;

public class Lab1205 {

	public static void main(String[] args) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("D:\\txtFile\\student.txt"));
		String tmp = "";
		int k = 1;
		
		Head();
		while((tmp=readFile.readLine()) !=null) {
			String[] data = tmp.split(" ");
			
			char firstName = data[2].charAt(0);
			String lastName = data[3];
			double grade = Double.parseDouble(data[5]);
			String ID = data[0];
			
			System.out.println(k+".\t"+ID+"\t"+Level(ID)+"\t"+firstName
					+"."+lastName+"\t"+grade+"\t"+ Status(grade));
			k++;
			
		}
		readFile.close();
	}

	public static String Level(String id) {
		int year = 22-Integer.parseInt(id.substring(0,2));
		return year+"th";
	}
	
	public static String Status(double gradeStatus) {
		if(gradeStatus>2.00) return ("Pass");
		else if(gradeStatus>=1.00||gradeStatus<=2.00) return ("Critical");
		else return "Retired";
		
	}
	
	public static void Head() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("********************************************************************");
	}
}
