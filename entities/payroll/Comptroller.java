package entities.payroll;

// use case controller
public class Comptroller {
	public static void printCheckForEmployee(int i) {
		// look up employee by id
		Employee foundEmployee = Employee.findById(i);
		// System.out.println(foundEmployee); // test
		
		// print check for that employee
		Check check = new Check();
		check.printForEmployee(foundEmployee);
	}
	
	public static void main(String[] args) {
		printCheckForEmployee(1);
	}


}
