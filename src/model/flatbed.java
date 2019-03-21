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

	public void LowerRamp() {
		ramp = Ramp.DOWN;
	}

	public void RaiseRamp() {
		ramp = Ramp.UP;
	}

	
}