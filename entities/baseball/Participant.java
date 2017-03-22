package entities.baseball;

public class Participant {
	private String name;

	@Override
	public String toString() {
		return "Participant [name=" + name + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Participant() {
		this("unknown participant");
	}

	public Participant(String name) {
		super();
		this.name = name;
	}
	
}
