package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CarPane extends Pane {

	private ImageView volvoImage;
	private ImageView scaniaImage;
	private ImageView saabImage;

	private double saabXPos;
	private double saabYPos;

	private double volvoXPos;
	private double volvoYPos;

	private double scaniaXPos;
	private double scaniaYPos;

	public CarPane() {
		volvoImage = new ImageView(new Image("/pics/Volvo740.jpg"));
		saabImage = new ImageView(new Image("/pics/Saab95.jpg"));
		scaniaImage = new ImageView(new Image("/pics/Scania.jpg"));

		this.getChildren().addAll(saabImage, volvoImage, scaniaImage);
		//this.getChildren().add(volvoImage);
		//this.getChildren().add(scaniaImage);
	}

	public void move(String model, double x, double y) {
		if (model.equals("Saab95")) {
			saabXPos = x;
			saabYPos = y;
		}
		if (model.equals("Scania")) {
			scaniaXPos = x;
			scaniaYPos = y;
		}
		if (model.equals("Volvo740")) {
			volvoXPos = x;
			volvoYPos = y;
		}
	}

	public void update() {
		saabImage.setX(saabXPos);
		saabImage.setTranslateY(saabYPos);
		scaniaImage.setX(scaniaXPos);
		scaniaImage.setTranslateY(scaniaYPos);
		volvoImage.setX(volvoXPos);
		volvoImage.setTranslateY(volvoYPos);
	}

}
