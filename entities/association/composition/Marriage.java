package entities.association.composition;

import java.time.*;
import entities.people.Person;

public class Marriage {
	private Person husband;
	private Person wife;
	private LocalDate marriedOn;
	private ZoneId zone;
	public Person getHusband() {
		return husband;
	}
	public void setHusband(Person husband) {
		if (husband == null){
			this.wife = null; // no set used on both, otherwise recursion
		}
		this.husband = husband;
	}
	public Person getWife() {
		return wife;
	}
	public void setWife(Person wife) {
		if (wife == null){
			this.husband = null; // no set used on both, otherwise recursion
		}
		this.wife = wife;
	}
	
	
}
