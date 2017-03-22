package entities.baseball;
import static entities.baseball.CoachAbility.*;

public class Coach extends Participant implements CoachAbility {
	//--------------------------- data structure
	private int speciality;
	private boolean isAssistant;
	
	//--------------------------- constructors
	public Coach() {
		this("Unnamed coach");
	}
	public Coach(String name) {
		super(name);
	}
	
	@Override
	public void coach() {
		switch (this.speciality) {
		case NONE:
			break;
		case BENCH:
			break;
		case BULLPEN:
			break;
		case CATCHING:
			break;
		case FIRST_BASE:
			break;
		case HITTING:
			break;
		case PITCHING:
			break;
		case THIRD_BASE:
			break;
		default:
			break;
		}
	}
}
