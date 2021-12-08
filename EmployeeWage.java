package emp;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int presentAbsent= (int)(Math.floor(Math.random() * 10)) % 2;
		if (presentAbsent==1) {
			System.out.println("Emplyee is present");
			
		}

		else {
			System.out.println("Employee is Absent ");
		}
	}
	}

