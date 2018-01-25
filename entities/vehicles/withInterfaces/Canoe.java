package entities.vehicles.withInterfaces;
import oo.interfaces.*;

public class Canoe
	implements IControlDirection, 
	IControlPower, ITransport {

	@Override
	public void carry(String cargo) {	
	}
	@Override
	public void load(String cargo) {
	}
	@Override
	public void unload(String cargo) {
	}
	@Override
	public void accelerateTo(double mph) {
	}
	@Override
	public void brakeTo(double mph) {
	}
	@Override
	public void turn(double degrees) {
	}
	
}
