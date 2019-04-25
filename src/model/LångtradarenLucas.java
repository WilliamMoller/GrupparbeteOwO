package model;
import javafx.scene.paint.Color;

public class LångtradarenLucas extends Vehicle {

	Loader loader;
	flatbed flak;

	public LångtradarenLucas() {
		super(600, "LångtradarenLucas", Color.BROWN);
		loader = new Loader(1);
		flak = new flatbed();
		stopEngine();
	}

	
	public void move() {
		super.move();
		loader.updatePos(this);
	}
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01;
	}

	public void LowerRamp() {
		if (getCurrentSpeed() > 0) {
			flak.closeRamp();

		}
	}

	public void RaisRamp() {
		if (getCurrentSpeed() > 0) {
			flak.openRamp();
		}
	}

	public void loadCar(Vehicle c) {
		if (this.getCurrentSpeed() == 0 && c != this && flak.isDown()) {
			loader.loadCar(c);
		}

	}

	public void unLoadCar() {
		if (this.getCurrentSpeed() == 0 && flak.isDown()) {
			loader.unLoadLastCar();
		}
	}

	public int getLoadedSize() {
		return loader.getSize();
	}

}
