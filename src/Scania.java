import javafx.scene.paint.Color;

public class Scania extends Vehicle{

	private int vinkel;
	/**
	 * Ger lastbilen hästkrafter, ett namn och färg
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
	 * Sänker flaket. Kan bar göra detta om lastbilen står still
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
	 * Höjer flaket. Kan bara göra det om lastbilen står still
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
