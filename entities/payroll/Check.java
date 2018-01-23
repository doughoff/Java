package entities.payroll;

import java.util.Date;

public class Check {
	private Date printed;
	private double amount;
	private PrintLayout checkLayout;
	public Check() {
		this.checkLayout = PrintLayout.createCheckLayout();
		System.out.println("Check created with layout.");
	}
	public void printForEmployee(Employee foundEmployee) {
		// use check with layout
		
		// find amount to pay by payrate and paygrade
			//lookup paygrade hourly amount
			double wage = 
				PayRate.findHourlyWageForPayGrade(foundEmployee.getPayGrade());
			// calc amount = wage * hours worked
			double calcAmount = wage * foundEmployee.getHoursWorked();
			this.amount = calcAmount;
		// print employee amount with name and id in layout
		System.out.printf("Check for %s of $%f\n",
			foundEmployee.getName(), this.amount);
	}

}
