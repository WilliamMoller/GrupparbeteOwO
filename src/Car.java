import javafx.scene.paint.Color;

public abstract class Car implements Moveable {

	private double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private String modelName; // The car model name

	/**
	 * direction = 0 -> RIGHT <br>
	 * direction = 1 -> DOWN <br>
	 * direction = 2 -> LEFT <br>
	 * direction = 3 -> UP
	 */
	private int direction;
	private double yPos;
	private double xPos;

	protected Car(double ep, String m, Color c) {
		color = c;
		enginePower = ep;
		modelName = m;

		direction = 0; // START RIGHT
		xPos = 0;
		yPos = 0;
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
	/**
	 * Bilen kan gasa när värdet är mellan 0 och 1
	 */
	public void gas(double amount) {
		if (amount > 0 && amount < 1) {
			incrementSpeed(amount);
		} else
			return;
	}
	/**
	 * Break fungerar så att bilen kan bromsa mellan värdena 0 och 1 
	 */
	public void brake(double amount) {
		if (amount > 0 && amount < 1) {
			decrementSpeed(amount);
		} else
			return;
	}

	/**
	 * Flyttar bilen framåt i dess riktning med currentSpeed
	 */
	public void move() {

		switch (direction) {
		case 0: // RIGHT
			xPos += getCurrentSpeed();
			break;
		case 1: // DOWN
			yPos -= getCurrentSpeed();
			break;
		case 2: // LEFT
			xPos -= getCurrentSpeed();
			break;
		case 3: // UP
			yPos += getCurrentSpeed();
			break;
		}

	}

	public void turnLeft() {
		direction = (direction + 3) % 4;
	}

	public void turnRight() {
		direction = (direction + 1) % 4;
	}

}
