import java.util.ArrayList;

import javafx.scene.paint.Color;

public class LångtradarenLucas extends Vehicle {

	private boolean Ramp = true;

	public LångtradarenLucas() {
		super(600, "LångtradarenLucas", Color.BROWN);
		stopEngine();
	}

	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01;
	}

	public void LowerRamp() {
		if (getCurrentSpeed() > 0) {
			Ramp = false;
			return;

		}
	}

	public void RaisRamp() {
		if (getCurrentSpeed() > 0) {
			Ramp = true;
			return;
		}
	}

	private ArrayList<Vehicle> Cars = new ArrayList<Vehicle>();

	public void loadCar(Vehicle c) {
		if (Cars.size() < 5 && isClose(c) && this.getCurrentSpeed() == 0 && c != this && Ramp == false){
			Cars.add(c);

		}
	}
	
	public void unloadCar() {
		if (Cars.size() > 0 && this.getCurrentSpeed() == 0 && Ramp == false ) {
			Cars.remove(Cars.size()-1);
		}
	}

	private boolean isClose(Vehicle c) {
		double distance = 10;
		double deltaX = this.getX() - c.getX();
		double deltaY = this.getY() - c.getY();

		if ((deltaX <= distance && deltaX >= -distance) && (deltaY <= distance && deltaY >= -distance)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public void updatePos(Vehicle c) {
		c.setX(this.getX());
		c.setY(this.getY());
	}
}
