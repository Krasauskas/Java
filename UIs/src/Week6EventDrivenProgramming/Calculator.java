package Week6EventDrivenProgramming;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.*;

/**Created by V Krasauskas
/**
/**Created on Mar 9, 2018**/

public class Calculator extends Application {
	
	private TextField tfNum1 = new TextField();
	private TextField tfNum2 = new TextField();
	private TextField tfResult = new TextField();
	private Button btAdd = new Button("Add");
	private Button btSubtract = new Button("Subtract");
	private Button btMultiply = new Button("Multiply");
	private Button btDivide = new Button("Divide");
	private double tfWidth = 50;
	private double buttonWidth = 75;
	

	
	@Override
	public void start(Stage primaryStage) {
		GridPane grid = new GridPane();
		grid.setHgap(1);
		grid.setVgap(5);
		grid.add(new Label("Number 1:"), 0, 0);
		grid.add(tfNum1, 1, 0);
		grid.add(new Label("Number 2:"), 2, 0);
		grid.add(tfNum2, 3, 0);
		grid.add(new Label("Result:"), 4, 0);
		grid.add(tfResult, 5, 0);
		grid.add(btAdd, 0, 1);
		grid.add(btSubtract, 1, 1);
		grid.add(btMultiply, 2, 1);
		grid.add(btDivide, 3, 1);
		
		grid.setAlignment(Pos.CENTER);
		grid.setPrefHeight(75);
		grid.setPrefWidth(400);
		tfNum1.setPrefWidth(tfWidth);
		tfNum2.setPrefWidth(tfWidth);
		tfResult.setPrefWidth(tfWidth);
		btAdd.setPrefWidth(buttonWidth);
		btSubtract.setPrefWidth(buttonWidth);
		btMultiply.setPrefWidth(buttonWidth);
		btDivide.setPrefWidth(buttonWidth);
		tfResult.setEditable(false);
		
		
		btAdd.setOnAction(e -> add());
		btSubtract.setOnAction(e -> subtract());
		btMultiply.setOnAction(e -> multiply());
		btDivide.setOnAction(e -> divide());
		
		Scene scene = new Scene(grid);
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void add() {
		double result = Double.parseDouble(tfNum1.getText()) - Double.parseDouble(tfNum2.getText());
		tfResult.setText(String.valueOf(result));
	}
	
	private void subtract() {
		double result = Double.parseDouble(tfNum1.getText()) - Double.parseDouble(tfNum2.getText());
		tfResult.setText(String.valueOf(result));
	}
	
	private void multiply() {
		double result = Double.parseDouble(tfNum1.getText()) * Double.parseDouble(tfNum2.getText());
		tfResult.setText(String.valueOf(result));
	}
	
	private void divide() {
		double result = Double.parseDouble(tfNum1.getText()) / Double.parseDouble(tfNum2.getText());
		tfResult.setText(String.valueOf(result));
		
	}

	public static void main(String[] args) {

	launch(args);	
	}

}
