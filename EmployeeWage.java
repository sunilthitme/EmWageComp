package emp;

public class EmployeeWage {

	public static void main(String[]args) {
		   System.out.println("Welcome to Employee Wage Computation");
			int presentAbsent= (int)(Math.floor(Math.random() * 10)) % 3;
		   int workingHour;
		   int wagePerHour=20;
		   if(presentAbsent==0) {
		       workingHour=8;
		       System.out.print("Employee is Present Full time	");
		   }
		   else if(presentAbsent==1) {
			   workingHour=4;
		       System.out.print("Employee is Present part time	");
		   }
		   else {
			     workingHour=0;
			     System.out.print("Employee is Absent");
		   }
	int dailyWage=workingHour*wagePerHour;
	System.out.println("Employee daily wage is"+dailyWage);
		   }
	   }