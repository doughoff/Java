package entities.baseball;

public interface CoachAbility {
	//------------------------------------ constants
	int NONE = 0;
	int PITCHING = 1;   // all fields are public static final
	int BENCH = 2;
	int HITTING = 3;
	int FIRST_BASE = 4;
	int THIRD_BASE = 5;
	int BULLPEN = 6;
	int CATCHING = 7;
	//------------------------------------ abstract methods
	void coach();
	// same as public abstract void coach();
}
