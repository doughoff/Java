package entities;

import java.util.Arrays;

public class Egg {
	// ----------------------------- data definition
	private String color;
	private String size;
	private boolean isBad;
	//------------------------------ constructors

	public Egg() {
		this("white", "L", false);
	}
	public Egg(String color, String size, boolean isBad) {
		super();
		this.color = color;
		this.size = size;
		this.isBad = isBad;
	}	
	// ---------------------------- getters and setters
	public String getColor() {
		return this.getColor();
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isBad() {
		return isBad;
	}

	public void setBad(boolean isBad) {
		this.isBad = isBad;
	}
	// ----------------------------- processes

	@Override
	public String toString() {
		return size + " " + color;
	}

}
