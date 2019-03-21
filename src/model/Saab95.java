package model;
import javafx.scene.paint.Color;

public class Saab95 extends Car {

	public boolean turboOn;

	public Saab95() {
		super(125, "Saab95", Color.BLACK);
		stopEngine();
	}

	
	
	public void setTurboOn() {
		turboOn = true;
	}

	public void setTurboOff() {
		turboOn = false;
	}
	@Override
	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return getEnginePower() * 0.01 * turbo;
	}
}