package entities.baseball;

public class Manager extends Participant implements IManage {
	//---------------------------------- data structure
	private CoachAbility coaching;   // optional behavior
	
	//---------------------------------- constructors
	public Manager() {
		this("Unnamed manager");
	}
	public Manager(String name) {
		super(name);
	}
	@Override
	public void plan() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void organize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lead() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void control() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hire() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		
	}
	
}
