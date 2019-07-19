package entities.animals;

import entities.function.TrickTraining;

public class HuntingDog extends Dog {
	private String game;
	public HuntingDog() {
		this("Yeller", null, "ducks");
	}
	public HuntingDog(String name, 
			TrickTraining trickTraining, String game) {
		super(name, trickTraining);
		this.game = game;
	}
	public void hunt() {
		System.out.println("I'm hunting");
	}
	
	@Override
	public void doWhatYoureTrainedToDo() {
		super.doWhatYoureTrainedToDo();       // Dog 
		System.out.println("And I know how to hunt.");  // HuntingDog
		this.hunt();
	}

	@Override
	public String toString() {
		String result = String.format
				("%s[game=%s]",super.toString(),this.game); 
		return result;
	}

	public static void main(String[] args) {
		HuntingDog blue = new HuntingDog();
		blue.doWhatYoureTrainedToDo();
		System.out.println(blue);
		int i = 1;
		i++;
		i++;
	}
}
