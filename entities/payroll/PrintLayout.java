package entities.payroll;

public class PrintLayout {
	// lots of factory methods for form layouts
	private String description;
	
	public static PrintLayout createCheckLayout() {
		PrintLayout checkLayout = new PrintLayout();
		checkLayout.description = "A check layout";
		return checkLayout;
	}
	// createPayrollReportLayout...
}
