import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Loader  {

	private ArrayList<Vehicle> Cars = new ArrayList<Vehicle>();

	public void loadCar(Vehicle c) {
		if (Cars.size() < 5 && isClose(c) && this.getCurrentSpeed() == 0 && c != this && Ramp == false){
			Cars.add(c);


}
}}