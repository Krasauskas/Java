package week7;

import java.util.Arrays;
import java.util.Collections;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**Created by V Krasauskas
/**
/**Created on Mar 20, 2018**/

public class Exercise1 extends Application {
	
	private TextField tf = new TextField();
	private Button button1 = new Button("Sort");
	private Button button2 = new Button("Shuffle");
	private Button button3 = new Button("Reverse");
	private TextArea ta = new TextArea();

	@Override
	public void start(Stage stage) {
		
		BorderPane border = new BorderPane();
		HBox hbox = new HBox();
		hbox.getChildren().addAll(new Label("Enter a number: "), tf);
		HBox hbox2 = new HBox();
		hbox2.getChildren().addAll(button1, button2, button3);
		border.setTop(hbox);
		border.setCenter(ta);
		border.setBottom(hbox2);
		
		hbox.setAlignment(Pos.BASELINE_CENTER);
		hbox2.setAlignment(Pos.BASELINE_CENTER);
		
		ta.setText("");
		tf.setOnAction(e -> submit());
		button1.setOnAction(e -> sort());
		button2.setOnAction(e -> shuffle());
		button3.setOnAction(e -> reverse());
		
		Scene scene = new Scene(border);
		stage.getIcons().add(new Image("file:src/week7/icon/vk.png"));
		stage.setTitle("Numbers");
		stage.setScene(scene);
		stage.show();
	}
	
	public void submit() {
		boolean contains = false; //number already present or illegal
		String s = tf.getText();
		for (String a : ta.getText().split(" ")) {
			if (s.equals(a)) {
				contains = true;
				tf.setText("");
			}
		}
		if(!contains) {
			ta.appendText(s + " ");
			tf.setText("");
		}
	}
	
	public void sort() {
		String[] nums = ta.getText().split(" ");
		int[] ints = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ints[i] = Integer.parseInt(nums[i]);
		}
		Arrays.sort(ints);
		ta.setText("");
		for(int i = 0; i < ints.length; i++) {
			ta.appendText(ints[i] + " ");
		}
	}
	
	public void shuffle() {
		String[] nums = ta.getText().split(" ");
		Collections.shuffle(Arrays.asList(nums));
		ta.setText("");
		for(String s : nums) {
			ta.appendText(s + " ");
		}
	}
	
	public void reverse() {
		String[] nums = ta.getText().split(" ");
		Collections.reverse(Arrays.asList(nums));
		ta.setText("");
		for(String s : nums) {
			ta.appendText(s + " ");
		}
	}
	
	public static void main(String[] args) {

		launch(args);
	}

}
