import java.util.Scanner;
import java.io.*;
public class example1202 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.print("Input Sectoion : ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);
		
	}
	
	public static void showListStudent(int sectionInput) throws IOException{
		//read data from using BufferedReader class
		BufferedReader readFile = new BufferedReader(new FileReader("D:\\txtFile\\List107.txt"));
		String tmp = "";
		while((tmp = readFile.readLine()) !=null) {
			String[] data = tmp.split("\t");
			//
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore   = Double.parseDouble(data[5]);
			int sectionFile = Integer.parseInt(data[3]);
			
			if(sectionFile==sectionInput) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtermScore
						+"\t"+finalScore+findResult(midtermScore,finalScore));
			}
			
		}
		readFile.close();
	}
	
	public static String findResult(double midtermscore,double finalscore) {
		double totalScore = midtermscore+finalscore;
		/*if(totalScore<=40)return "Fail";
		else return "Pass";*/
		return totalScore<=40?"Fail":"Pass";
		
	}
	
	public static void Header(int sec) {
		System.out.println("******************************************");
		System.out.print("\tList of Data for Sectoin "+sec);
		System.out.println("******************************************");
		
	}
}
