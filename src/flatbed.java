
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

	public void LowerRamp() {
		ramp = Ramp.DOWN;
	}

	public void RaiseRamp() {
		ramp = Ramp.UP;
	}

}