import javafx.scene.paint.Color;

public abstract class Car implements Moveable {
	
	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name
	
	protected Car(double ep, String m, Color c) {
		color = c;
		enginePower = ep;
		modelName = m;
	}
			
	public double getEnginePower() {
		return enginePower;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public Color getColor() {
		return color;
	}

	public void startEngine() {
		currentSpeed = 0.1;
	}

	public void stopEngine() {
		currentSpeed = 0;
	}
	
	public double speedFactor() {
		return 0;
	}
	
	public void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	public void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) {
		if(amount <= 0 || amount > 0){
			incrementSpeed(amount);
		}
		else return;
	}

	public void brake(double amount) {
		if(amount < 0 || amount > 0){
			decrementSpeed(amount);
		}
		else return;
	}
}
