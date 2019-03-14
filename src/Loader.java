import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Loader {

	private ArrayList<Vehicle> Cars = new ArrayList<Vehicle>();
	private int capacity;

	public Loader(int cap) {
		this.capacity = cap;
	}

	public void loadCar(Vehicle c) {
		if (Cars.size() < capacity) {
			Cars.add(c);
		}

	}
	
	public void unLoadLastCar() {
		if (Cars.size() > 0 ) {
			Cars.remove(Cars.size() - 1);
		}
	}
	
	public void unLoadFirstCar() {
		if (Cars.size() > 0) {
			Cars.remove(0);
		}
	}
	
}