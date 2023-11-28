import java.util.*;
import java.text.*;
public class PensionContributionCalculator {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("####.00");
		final int SALARY_CEILING = 6000;
		 final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		 final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		 final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		 final double EMPLOYER_RATE_55_TO_60 = 0.13;
		 final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		 final double EMPLOYER_RATE_60_TO_65 = 0.09;
		 final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		 final double EMPLOYER_RATE_65_ABOVE = 0.075;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 int salary, age;
		 System.out.print("Enter the monthly salary: $");
		 salary = scan.nextInt();
		 System.out.print("Enter the age: ");
		 age = scan.nextInt();
		 int contributableSalary;
		 double employeeContribution, employerContribution, totalContribution;
		 
		 contributableSalary = Math.min(salary, SALARY_CEILING);
		 
		 if (age <= 55) { // 55 and below
			 employeeContribution = contributableSalary*EMPLOYEE_RATE_55_AND_BELOW;
			 employerContribution = contributableSalary*EMPLOYER_RATE_55_AND_BELOW;
		 } else if (age <= 60) { // (60, 65]
			 employeeContribution = contributableSalary*EMPLOYEE_RATE_55_TO_60;
			 employerContribution = contributableSalary*EMPLOYER_RATE_55_TO_60;
		 } else if (age <= 65) { // (55, 60]
			 employeeContribution = contributableSalary*EMPLOYEE_RATE_60_TO_65;
			 employerContribution = contributableSalary*EMPLOYER_RATE_60_TO_65;
		 } else { // above 65
			 employeeContribution = contributableSalary*EMPLOYEE_RATE_65_ABOVE;
			 employerContribution = contributableSalary*EMPLOYER_RATE_65_ABOVE;
		 }
		 System.out.println("The Employee's contribution is: $"+frm.format(employeeContribution));
		 System.out.println("The Employer's contribution is: $"+frm.format(employerContribution));
		 System.out.println("The total contribution is: $"+frm.format(employeeContribution+employerContribution));
		
	}

}
;