package oo.interfaces;

import java.math.BigDecimal;

public class CloneableThing implements Cloneable {
	private BigDecimal decimal;
	
	public static void main(String[] args) {
		CloneableThing thing = new CloneableThing();
		thing.decimal = new BigDecimal("12345");
		CloneableThing clonedThing = null; 
		try {
			clonedThing = (CloneableThing) thing.clone();
		} catch (CloneNotSupportedException e) {
		}
		showComparison(thing, clonedThing);	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		System.out.println("Cloning (shallow)");
//		return super.clone();
//	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("Cloning (deep)");
		CloneableThing copy = (CloneableThing) super.clone();
		copy.decimal = new BigDecimal(this.decimal.toString());
		return copy;
	}
	
	private static void showComparison(CloneableThing thing, CloneableThing clonedThing) {
		System.out.println(thing.decimal);
		System.out.println(clonedThing.decimal);
		System.out.println(
				thing.decimal == clonedThing.decimal 
				? "Reference points to same field" 
				: "Reference points to different field");
	}
}
