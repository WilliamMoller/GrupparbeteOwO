package model;
import javafx.scene.paint.Color;

public class Scania extends Vehicle {

	private flatbed ramp;
	
	/**
	 * Självaste lastbilen och som i sin tur får hästkrafter, ett namn och färg
	 */
	public Scania() {
		super(600, "Scania", Color.BLUE);
		ramp = new flatbed();
		stopEngine();
	}

	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01;
	}

	/**
	 * Sänker flaket. Kan bar göra detta om lastbilen står still
	 */
	public void LowerRamp() {
		if (getCurrentSpeed() > 0) {
			return;
		} else {
			ramp.lowerRamp();
		}
	}

	/**
	 * Höjer flaket. Kan bara göra det om lastbilen står still
	 */
	public void RaiseRamp() {
		if (getCurrentSpeed() > 0) {
			return;
		} else {
			ramp.raiseRamp();
		}
	}
}
