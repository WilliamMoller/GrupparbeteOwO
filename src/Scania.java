import javafx.scene.paint.Color;

public class Scania extends Car{

	public Scania() {
		super(600, "Scania", Color.BLUE);
		stopEngine();
	}
	
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01;
	}

}
