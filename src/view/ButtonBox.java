package view;

import controller.CarController;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ButtonBox extends HBox {

	private CarController controller;
	private Spinner<Integer> spinner;
	private Button gasButton;
	private Button brakeButton;
	private Button turboOnButton;
	private Button turboOffButton;
	private Button rampUpButton;
	private Button rampDownButton;

	
	
	public ButtonBox(CarController cc) {
		this.controller = cc;
		setStyle();
		addComponents();
		addEventListeners();
	}

	private void addEventListeners() {
		gasButton.setOnAction(e -> {
			controller.gas(spinner.getValue() / 100.0);
		});
		brakeButton.setOnAction(e -> {
			controller.brake(spinner.getValue() / 100.0);
		});
		turboOnButton.setOnAction(e -> {
			controller.turboOn();
		});
		turboOffButton.setOnAction(e -> {
			controller.turboOff();
		});
		
		rampUpButton.setOnAction(e -> {
			controller.turboOff();
		});
		
		rampDownButton.setOnAction(e -> {
			controller.turboOff();
		});
	}

	private void addComponents() {
		VBox container = new VBox();
		HBox spinnerBox = new HBox();
		HBox buttonsBox = new HBox();

		spinner = new Spinner<Integer>(0, 100, 50);
		spinner.setEditable(true);

		gasButton = new Button("Gas");
		gasButton.setPrefSize(100, 20);

		brakeButton = new Button("Brake");
		brakeButton.setPrefSize(100, 20);
		
		turboOnButton = new Button("TurboOn");
		turboOnButton.setPrefSize(100, 20);
		
		turboOffButton = new Button("TurboOff");
		turboOffButton.setPrefSize(100, 20);
		
		rampUpButton = new Button("RampUp");
		rampUpButton.setPrefSize(100, 20);
		
		rampDownButton = new Button("RampDown");
		rampDownButton.setPrefSize(100, 20);

		spinnerBox.getChildren().addAll(spinner);
		buttonsBox.getChildren().addAll(gasButton, brakeButton, rampUpButton, rampDownButton, turboOnButton, turboOffButton);
		container.getChildren().addAll(spinnerBox, buttonsBox);

		this.getChildren().addAll(container);

	}

	private void setStyle() {
		this.setPadding(new Insets(15, 12, 15, 12));
		this.setSpacing(10);
		this.setStyle("-fx-background-color: #ea0771;");
	}

}
