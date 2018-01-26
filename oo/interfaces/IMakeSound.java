package oo.interfaces;

public interface IMakeSound {
	// fields always public static final (constant)
	// use: import static wednesday.IMakeSound.*;
	String SOUND_OF_SILENCE = ".";
	String HUM = "mmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
	String WHISTLE = "tweeeeeeeeeeeeeeeeeeeeet";
	String BUZZ = "ZZZzzZZzzzzzzzzZZzZZZZZZ";
	
	//everything is abstract public 
	void makeSound();
}
