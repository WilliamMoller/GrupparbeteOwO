package model;

public class flatbed {

	private Ramp ramp;
	private int angle;

	private enum Ramp {
		DOWN, UP
	};

	public flatbed() {
		angle = 0;
		ramp = Ramp.DOWN;
	}

	public boolean isUp() {
		return ramp == Ramp.UP;
	}

	public boolean isDown() {
		return ramp == Ramp.DOWN;
	}

	public void closeRamp() {
		ramp = Ramp.DOWN;
	}

	public void openRamp() {
		ramp = Ramp.UP;
	}

	public void raiseRamp() {
		angle += 10;
		if (angle >= 70)
			angle = 70;
	}

	public void lowerRamp() {
		angle -= 10;
		if (angle < 0)
			angle = 0;
	}

	public int getAngle() {
		return angle;
	}

}