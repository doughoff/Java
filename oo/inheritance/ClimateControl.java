package oo.inheritance;

public class ClimateControl {
	
	private double temp;
	
	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
		System.out.printf("temp is set to %.1fF", temp);
	}

	public ClimateControl(double temp) {
		this.setTemp(temp);
	}

}
