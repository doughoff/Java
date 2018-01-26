package entities;

import java.util.Date;
import oo.interfaces.*;

public class AlarmClock implements IMakeSound, Cloneable{
	private Date currentDateTime;
	private Date alarmSetTo;
	
	public void soundAlarm() {
		System.out.println("Ringggggggggggggggggg");
	}
	@Override
	public void makeSound() {
		this.soundAlarm();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		AlarmClock ac = new AlarmClock();
		AlarmClock acClone = (AlarmClock)ac.clone();
		System.out.println(ac == acClone);
	}
}
