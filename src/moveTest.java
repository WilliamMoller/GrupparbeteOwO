

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class moveTest {

	Volvo740 volvo = new Volvo740();

	@Test
	public void gasAndBrakeTest() {
		assertEquals(0, volvo.getCurrentSpeed(),0);
		volvo.gas(1);
		assertEquals(1.25, volvo.getCurrentSpeed(),0);
	}

	@BeforeEach
	public void resetVolvo() {
		volvo.stopEngine();
		volvo.setX(0);
		volvo.setY(0);
	}

}