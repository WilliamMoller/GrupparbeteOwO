import javafx.scene.paint.Color;

public class Scania extends Car{

	private int vinkel;
	
	public Scania() {
		super(600, "Scania", Color.BLUE);
		stopEngine();
	}
	
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01;
	}

	public void s�nkFlak() {
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
	
	public void h�jFlak() {
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
