

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class moveTest {

	Volvo740 volvo = new Volvo740();

	@Test
	public void volvoDriveTest() {
		assertEquals(0, volvo.getCurrentSpeed(),0);
		volvo.gas(1);
		assertEquals(1.25, volvo.getCurrentSpeed(),0);
		volvo.move();
		volvo.move();
		assertEquals(2.5, volvo.getX(),0);
		volvo.turnLeft();
		volvo.move();
		assertEquals(2.5, volvo.getX(),0);
		assertEquals(1.25, volvo.getY(),0);
		volvo.brake(1);
		assertEquals(0, volvo.getCurrentSpeed(),0);
		
		for (int i = 0; i < 100; i++) {
			volvo.gas(1);			
		}

		assertEquals(volvo.getEnginePower(), volvo.getCurrentSpeed(),0);
		for (int i = 0; i < 100; i++) {
			volvo.brake(1);
		}
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		
	}
	
	@Test
	public void saabTurboTest() {
		Saab95 saab = new Saab95();
		
		assertEquals(0, saab.getCurrentSpeed(),0);
		saab.gas(1);
		assertEquals(1.25, saab.getCurrentSpeed(), 0);
		saab.move();
		assertEquals(1.15, saab.getCurrentSpeed(), 0);
		saab.setTurboOn();
		
		
		
	}

	@BeforeEach
	public void resetVolvo() {
		volvo.stopEngine();
		volvo.setX(0);
		volvo.setY(0);
	}

}