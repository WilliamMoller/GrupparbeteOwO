
public class flatbed {
	
	private boolean Ramp = true;
	
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
}