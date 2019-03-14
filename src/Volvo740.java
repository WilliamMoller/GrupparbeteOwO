import javafx.scene.paint.Color;

public class Volvo740 extends Vehicle{

	public final static double trimFactor = 1.25;

	public Volvo740() {
		super(100, "Volvo740" , Color.RED);
		stopEngine();
	}
	
	
	
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01 * trimFactor;
	}
}