import java.util.ArrayList;

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
	

	private boolean isClose(Vehicle owner , Vehicle c) {
		double distance = 10;
		double deltaX = owner.getX() - c.getX();
		double deltaY = owner.getY() - c.getY();

		if ((deltaX <= distance && deltaX >= -distance) && (deltaY <= distance && deltaY >= -distance)) {
			return true;
		} else {
			return false;
		}
	}

	public void updatePos(Vehicle owner , Vehicle c) {
		c.setX(owner.getX());
		c.setY(owner.getY());
	}
	
}