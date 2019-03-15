import javafx.scene.paint.Color;

public class Scania extends Vehicle{

	private int vinkel;
	/**
	 * Ger lastbilen h�stkrafter, ett namn och f�rg
	 */
	public Scania() {
		super(600, "Scania", Color.BLUE);
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
		if (getCurrentSpeed() > 0){
			return;
		}
		else {
			vinkel--;
			if(vinkel < 0){
				vinkel = 0;
			}
		}
	}
	/**
	 * H�jer flaket. Kan bara g�ra det om lastbilen st�r still
	 */
	public void RaiseRamp() {
		if (getCurrentSpeed() > 0){
			return;
		}
		else {
			vinkel++;
			if(vinkel > 70){
				vinkel = 70;
			}
		}
	}
}
