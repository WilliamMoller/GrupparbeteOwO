package model;
import javafx.scene.paint.Color;

public class L�ngtradarenLucas extends Vehicle {

	Loader loader;
	flatbed flak;

	/**
	 * Ger lastbilen h�stkrafter, namn och f�rg
	 */
	public L�ngtradarenLucas() {
		super(600, "L�ngtradarenLucas", Color.BROWN);
		loader = new Loader(1);
		flak = new flatbed();
		stopEngine();
	}

	/**
	 * Move s� att lastbilen kan flytta sig
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
	 * S�nker rampen
	 */
	public void LowerRamp() {
		if (getCurrentSpeed() > 0) {
			flak.closeRamp();

		}
	}

	/**
	 * H�jer rampen
	 */
	public void RaisRamp() {
		if (getCurrentSpeed() > 0) {
			flak.openRamp();
		}
	}
	
	/**
	 * Om lastbilen st�r still s� kan man lasta p� bilar
	 * 
	 */
	public void loadCar(Vehicle c) {
		if (this.getCurrentSpeed() == 0 && c != this && flak.isDown()) {
			loader.loadCar(c);
		}

	}
	
	/**
	 * Om lastbilen st�r still s� kan man lasta av bilar
	 * 
	 */
	public void unLoadCar() {
		if (this.getCurrentSpeed() == 0 && flak.isDown()) {
			loader.unLoadLastCar();
		}
	}

	/**
	 * H�mta antalet bilar innuti
	 * 
	 */
	public int getLoadedSize() {
		return loader.getSize();
	}

}
