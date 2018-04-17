package Week6EventDrivenProgramming;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by V Krasauskas /** /**Created on Mar 17, 2018
 **/

public class AlternatingMessages extends Application {

	private Button button = new Button("Alternator");
	private boolean state = true;
	private TextField text = new TextField("Man United. Such a Boring….");

	public void start(Stage primStage) {
		GridPane grid = new GridPane();
		grid.setVgap(2);
		grid.add(text, 0, 0);
		grid.add(button, 0, 1);
		text.setEditable(false);
		text.setPrefWidth(200);
		text.setAlignment(Pos.CENTER);
		button.setOnAction(e -> alternate());
		GridPane.setHalignment(button, HPos.CENTER);
		Scene scene = new Scene(grid);
		primStage.setTitle("The Alternator");
		primStage.setScene(scene);
		primStage.show();
	}

	public void alternate() {
		if (state) {
			text.setText("Man City Flies Best!!");
			state = !state;
		} else {
			text.setText("Man United. Such a Boring….");
			state = !state;
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
