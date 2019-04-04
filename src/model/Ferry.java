package model;
import javafx.scene.paint.Color;

public class Ferry extends Vehicle{
	
	Loader loader;
	flatbed flak;

	/**
	 * Tilldelar färjan hästkrafter, namn och färg.
	 */
	protected Ferry() {
		super(2000, "Stena" , Color.ALICEBLUE);
		loader = new Loader(75);
		stopEngine();
	}
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01;
		}
	
	/**
	 * Lasta på bilar
	 * 
	 */
	public void loadCar(Vehicle c) {
			loader.loadCar(c);
		}

	/**
	 * Lasta av bilar
	 */
	public void unloadCar() {
		if (this.getCurrentSpeed() == 0 && flak.isDown()) {
		}
	}
	/**
	 * Kollar antalet bilar innuti
	 * 
	 */
	public int getLoadedSize() {
		return loader.getSize();
	}


	
	
	
}
