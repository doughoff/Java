package entities.payroll;

public class Employee {
	private int id;
	private String name, payGrade;
	private double hoursWorked;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPayGrade() {
		return payGrade;
	}
	public void setPayGrade(String payGrade) {
		this.payGrade = payGrade;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public Employee() {
		this(0,"Mr. Employee", "A1", 40);
	}
	public Employee(int id, String name, 
			String payGrade, double hoursWorked) {
		this.id = id;
		this.name = name;
		this.payGrade = payGrade;
		this.hoursWorked = hoursWorked;
	}
@Override
public String toString() {
	return String.format("Employee[id=%d, name=%s"
			+ ", payGrade=%s, hoursWorked=%.1f]\n",
			this.id, this.name, this.payGrade, 
			this.hoursWorked);
}
	public static Employee findById(int i) {
		// get data from db, create object
		return new Employee(i,"Doug","E5",45.5);
	}

}
