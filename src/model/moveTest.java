package model;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class moveTest {

	Volvo740 volvo = new Volvo740();
	Saab95 saab = new Saab95();

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
		
		assertEquals(0, saab.getCurrentSpeed(),0);
		saab.gas(1);
		assertEquals(1.25, saab.getCurrentSpeed(), 0);
		saab.move();
		assertEquals(1.25, saab.getX(), 0);
		saab.setTurboOn();
		saab.gas(1);
		assertEquals(1.25+1.25*1.3,saab.getCurrentSpeed(), 0);
		saab.setTurboOff();
		saab.gas(1);
		assertEquals(1.25+1.25+1.25*1.3,saab.getCurrentSpeed(),0);
		saab.brake(1);
		saab.setTurboOn();
		saab.brake(1);
		assertEquals(1.25,saab.getCurrentSpeed(),0);
		saab.brake(1);
		assertEquals(0,saab.getCurrentSpeed(),0);
		
		
	}
		@Test
		public void scaniaRampTest() {
			Scania scania = new Scania();
			
			
			assertEquals(0, scania.getCurrentSpeed(),0);
			scania.gas(1);
			scania.gas(1);
			assertEquals(12, scania.getCurrentSpeed(), 0);
			scania.move();
			assertEquals(12, scania.getX(), 0);
			scania.LowerRamp();
			
			
			
		}
		
		@Test
		public void långtradarenLucas() {
			LångtradarenLucas lucas = new LångtradarenLucas();
			assertEquals(0, lucas.getCurrentSpeed(), 0);
			lucas.gas(1);
			assertEquals(6, lucas.getCurrentSpeed(), 0);
			lucas.loadCar(saab);
			assertEquals(0,lucas.getLoadedSize(),0);
			lucas.brake(1);
			lucas.LowerRamp();
			lucas.loadCar(saab);
			assertEquals(1,lucas.getLoadedSize(),0);
			lucas.RaisRamp();
			lucas.gas(1);
			lucas.gas(1);
			lucas.gas(1);
			lucas.gas(1);
			lucas.gas(1);
			lucas.move();
			lucas.move();
			lucas.move();
			assertEquals(saab.getX(),lucas.getX(),0);
			assertEquals(saab.getY(),lucas.getY(),0);
			lucas.brake(1);
			lucas.brake(1);
			lucas.brake(1);
			lucas.brake(1);
			lucas.brake(1);
			lucas.brake(1);
			assertEquals(0, lucas.getCurrentSpeed(), 0);
			lucas.unLoadCar();
			assertEquals(0, lucas.getLoadedSize(), 0);
			lucas.gas(1);
			lucas.move();
			assertEquals(96, lucas.getX(), 0);
			assertEquals(saab.getY(), lucas.getY(), 0);
			
		}
		@Test
		public void ferry() {
			Ferry ferry = new Ferry();
			assertEquals(0, ferry.getCurrentSpeed(), 0);
			ferry.gas(1);
			assertEquals(20, ferry.getCurrentSpeed(), 0);
			ferry.brake(1);
			ferry.loadCar(saab);
			ferry.loadCar(volvo);
			ferry.loadCar(saab);
			assertEquals(3, ferry.getLoadedSize(), 0);
			
		}
		
		
		
	

	@BeforeEach
	public void resetVolvo() {
		volvo.stopEngine();
		volvo.setX(0);
		volvo.setY(0);
	}

}