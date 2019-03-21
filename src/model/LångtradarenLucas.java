package model;
import javafx.scene.paint.Color;

public class LångtradarenLucas extends Vehicle {

	Loader loader;
	flatbed flak;

	public LångtradarenLucas() {
		super(600, "LångtradarenLucas", Color.BROWN);
		loader = new Loader(5);
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
			flak.LowerRamp();

		}
	}

	public void RaisRamp() {
		if (getCurrentSpeed() > 0) {
			flak.RaiseRamp();
		}
	}

	public void loadCar(Vehicle c) {
		if (this.getCurrentSpeed() == 0 && c != this && flak.isDown()) {
			loader.loadCar(c);
		}

	}

	public void unloadCar() {
		if (this.getCurrentSpeed() == 0 && flak.isDown()) {
		}
	}

	public int getLoadedSize() {
		return loader.getSize();
	}

}
