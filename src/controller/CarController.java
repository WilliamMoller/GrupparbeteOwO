package controller;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import model.Saab95;
import model.Scania;
import model.Vehicle;
import view.CarPane;

public class CarController {

	private ArrayList<Vehicle> model;

	public CarController(CarPane cp) {

		model = new ArrayList<Vehicle>();

		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				if (model != null) {
					for (Vehicle vehicle : model) {
						vehicle.move();
						cp.move(vehicle.getModelName(), vehicle.getX(), vehicle.getY());
					}
					checkBounds();
					cp.update();
				}
			}
		};
		at.start();
	}

	public void turboOff() {
		for (Vehicle vehicle : model) {
			if (vehicle.getModelName().equals("Saab95")) {
				((Saab95) vehicle).setTurboOff();
			}
		}
	}

	public void RampUp() {
		for (Vehicle vehicle : model) {
			if (vehicle.getModelName().equals("Scania")) {
				((Scania) vehicle).LowerRamp();
			}
		}
	}

	public void RampDown() {
		for (Vehicle vehicle : model) {
			if (vehicle.getModelName().equals("Scania")) {
				((Scania) vehicle).RaiseRamp();
				;
			}
		}
	}

	public void turboOn() {
		for (Vehicle vehicle : model) {
			if (vehicle.getModelName().equals("Saab95")) {
				((Saab95) vehicle).setTurboOn();
			}
		}
	}

	public void gas(double amount) {
		for (Vehicle vehicle : model) {
			vehicle.gas(amount);
		}
	}

	public void brake(double amount) {
		for (Vehicle vehicle : model) {
			vehicle.brake(amount);
		}
	}

	public void checkBounds() {
		for (Vehicle vehicle : model) {
			if (vehicle.getX() > 1100 || vehicle.getX() < 0) {
				vehicle.turnLeft();
				vehicle.turnLeft();
				vehicle.move();
			}
		}
	}

	public void addVehicle(Vehicle v) {
		v.setY(model.size() * 100);
		model.add(v);

	}

}
