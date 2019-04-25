package model;
import javafx.scene.paint.Color;

public class Scania extends Vehicle {

	private flatbed ramp;
	
	/**
	 * Sj�lvaste lastbilen och som i sin tur f�r h�stkrafter, ett namn och f�rg
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
	 * S�nker flaket. Kan bar g�ra detta om lastbilen st�r still
	 */
	public void LowerRamp() {
		if (getCurrentSpeed() > 0) {
			return;
		} else {
			ramp.lowerRamp();
		}
	}

	/**
	 * H�jer flaket. Kan bara g�ra det om lastbilen st�r still
	 */
	public void RaiseRamp() {
		if (getCurrentSpeed() > 0) {
			return;
		} else {
			ramp.raiseRamp();
		}
	}
}
