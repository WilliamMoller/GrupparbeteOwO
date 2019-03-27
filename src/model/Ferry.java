package model;
import javafx.scene.paint.Color;

public class Ferry extends Vehicle{
	
	Loader loader;
	flatbed flak;

	protected Ferry() {
		super(2000, "Stena" , Color.ALICEBLUE);
		loader = new Loader(75);
		stopEngine();
	}
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01;
		}
	
	public void loadCar(Vehicle c) {
			loader.loadCar(c);
		}


	public void unloadCar() {
		if (this.getCurrentSpeed() == 0 && flak.isDown()) {
		}
	}
	
	public int getLoadedSize() {
		return loader.getSize();
	}


	
	
	
}