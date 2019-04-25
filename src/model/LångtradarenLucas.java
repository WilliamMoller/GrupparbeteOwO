package model;
import javafx.scene.paint.Color;

public class LångtradarenLucas extends Vehicle {

	Loader loader;
	flatbed flak;

	/**
	 * Ger lastbilen hästkrafter, namn och färg
	 */
	public LångtradarenLucas() {
		super(600, "LångtradarenLucas", Color.BROWN);
		loader = new Loader(1);
		flak = new flatbed();
		stopEngine();
	}

	/**
	 * Move så att lastbilen kan flytta sig
	 */
	public void move() {
		super.move();
		loader.updatePos(this);
	}
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01;
	}
	
	/**
	 * Sänker rampen
	 */
	public void LowerRamp() {
		if (getCurrentSpeed() > 0) {
			flak.closeRamp();

		}
	}

	/**
	 * Höjer rampen
	 */
	public void RaisRamp() {
		if (getCurrentSpeed() > 0) {
			flak.openRamp();
		}
	}
	
	/**
	 * Om lastbilen står still så kan man lasta på bilar
	 * 
	 */
	public void loadCar(Vehicle c) {
		if (this.getCurrentSpeed() == 0 && c != this && flak.isDown()) {
			loader.loadCar(c);
		}

	}
	
	/**
	 * Om lastbilen står still så kan man lasta av bilar
	 * 
	 */
	public void unLoadCar() {
		if (this.getCurrentSpeed() == 0 && flak.isDown()) {
			loader.unLoadLastCar();
		}
	}

	/**
	 * Hämta antalet bilar innuti
	 * 
	 */
	public int getLoadedSize() {
		return loader.getSize();
	}

}
