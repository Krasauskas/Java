package pathFinder;

import java.util.Arrays;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by V Krasauskas /** /**Created on Mar 25, 2018
 **/

public class PathFinder extends Application {
	
	@Override
	public void start(Stage stage) {
		double[] sqr1 = {
				200.0, 200.0, 
				300.0, 200.0, 
				300.0, 300.0, 
				200, 300.0};
		BorderPane pane = new BorderPane();
		Pane canvas = new Pane();
		canvas.setStyle("-fx-background-color: black;");
		canvas.setPrefSize(1600, 900);
		Circle circle = new Circle(25, Color.RED);
		circle.relocate(40, 450);
		Polygon square1 = new Polygon(sqr1[0], sqr1[1], sqr1[2], sqr1[3], sqr1[4], sqr1[5], sqr1[6], sqr1[7]);
		square1.setFill(Color.CYAN);
		Rectangle long1 = new Rectangle(400, 80, Color.BLUE);
		long1.relocate(240, 50);
		canvas.getChildren().addAll(circle, long1, square1);
		pane.setCenter(canvas);
		HBox hbox = new HBox();
		pane.setTop(hbox);
		
		Scene scene = new Scene(pane);
		stage.getIcons().add(new Image("file:src/icon/vk.png"));
		stage.setTitle("Path Finder");
		stage.setScene(scene);
		stage.show();
		System.out.println(Arrays.deepToString(generatePolygons()));

	}
	
	public double[][] generatePolygons() {
		double[][] arr = new double[8][8]; // 8 squares with 8 numbers of coordinates (x1, y1, x2, y2...)
		int counter = 0; //counter to differentiate between x and y
		double offsetX = 200; //offset from the left
		double offsetY = 50; //offset from the top
		double offset = 50; //space between polygons
		double vertex = 80; //length of vertex
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (counter % 2 == 0) { //x coordinate
					arr[i][j] = offsetX + ran.nextDouble() * vertex;
					offsetX += offset; //shift next x coordinate 
				} else { //y coordinate
					arr[i][j] = offsetY + ran.nextDouble() * vertex;
				}
			}
			offsetY += offset;
		}
		return arr;
		
	}

	public static void main(String[] args) {

		launch(args);
	}

}
