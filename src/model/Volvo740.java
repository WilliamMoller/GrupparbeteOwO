package model;
import javafx.scene.paint.Color;

public class Volvo740 extends Car{

	public final static double trimFactor = 1.25;

	/**
	 * Självaste bilen. Den i sin tur får hästkrafter, namn och färg
	 */
	public Volvo740() {
		super(10000, "Volvo740" , Color.RED);
		stopEngine();
	}
	
	
	
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01 * trimFactor;
	}
}