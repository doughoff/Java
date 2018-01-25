package entities.vehicles.withInterfaces;
import oo.interfaces.IMotorized;

public class VehicleTest {
	public static void main(String[] args) {
		IMotorized[] engines = 
			{new GoCart(),
					new Lawnmower(),
					new Speedboat()
			};
		for (IMotorized engine : engines) {
			engine.startMotor();
			engine.stopMotor();
		}
	}
}
