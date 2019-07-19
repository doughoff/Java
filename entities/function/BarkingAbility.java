package entities.function;

public class BarkingAbility {
	private String barkSound;
	
	@Override
	public String toString() {
		return "BarkingAbility [barkSound=" + barkSound + "]";
	}
	public String getBarkSound() {
		return barkSound;
	}
	public void setBarkSound(String barkSound) {
		this.barkSound = barkSound;
	}
	
	public BarkingAbility() {
		this("bark");
	}
	public BarkingAbility(String barkSound) {
		super();
		this.setBarkSound(barkSound);
	}
	
	public void bark() {
		System.out.println(this.getBarkSound());
	}
	

}
