package week7;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class MultipleBounceBall extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		MultipleBallPane ballPane = new MultipleBallPane();
		ballPane.setStyle("-fx-border-color: yellow");

		Button btAdd = new Button("+");
		Button btSubtract = new Button("-");
		Button btSuspend = new Button("Suspend");
		Button btResume = new Button("Resume");
		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(btSuspend, btResume, btAdd, btSubtract);
		hBox.setAlignment(Pos.CENTER);

		// Add or remove a ball
		btAdd.setOnAction(e -> ballPane.add());
		btSubtract.setOnAction(e -> ballPane.subtract());
		btSuspend.setOnAction(e -> ballPane.pause());
		btResume.setOnAction(e -> ballPane.play());

		// Pause and resume animation
		ballPane.setOnMousePressed(e -> ballPane.pause());
		ballPane.setOnMouseReleased(e -> ballPane.play());

		// Use a scroll bar to control animation speed
		ScrollBar sbSpeed = new ScrollBar();
		sbSpeed.setMax(20);
		sbSpeed.setValue(10);
		ballPane.rateProperty().bind(sbSpeed.valueProperty());

		BorderPane pane = new BorderPane();
		pane.setCenter(ballPane);
		pane.setTop(sbSpeed);
		pane.setBottom(hBox);

		// Create a scene and place the pane in the stage
		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setTitle("MultipleBounceBall"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		scene.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				System.out.println("mouse click detected! " + mouseEvent.getSource());
				double x = mouseEvent.getSceneX();
				double y = mouseEvent.getSceneY();
				ballPane.removeBall(x, y);
			}
		});
	}

	private class MultipleBallPane extends Pane {
		private Timeline animation;

		public MultipleBallPane() {
			// Create an animation for moving the ball
			animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
			animation.setCycleCount(Timeline.INDEFINITE);
			animation.play(); // Start animation
		}

		public void add() {
			Color color = new Color(Math.random(), Math.random(), Math.random(), 0.5);
			getChildren().add(new Ball(30, 30, 10, color));

		}

		public void subtract() {
			if (getChildren().size() > 0) {
				getChildren().remove(getChildren().size() - 1);
			}
		}
		
		public void removeBall(double x, double y) {
			for (Node n : getChildren()) {
				if (n.contains(x, y)) {
					getChildren().remove(n);
				}
			}
		}

		public void play() {
			animation.play();
		}

		public void pause() {
			animation.pause();
		}

		public void increaseSpeed() {
			animation.setRate(animation.getRate() + 0.1);
		}

		public void decreaseSpeed() {
			animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
		}

		public DoubleProperty rateProperty() {
			return animation.rateProperty();
		}

		protected void moveBall() {
			for (Node node : this.getChildren()) {
				Ball ball = (Ball) node;
				// Check boundaries
				if (ball.getCenterX() < ball.getRadius() || ball.getCenterX() > getWidth() - ball.getRadius()) {
					ball.dx *= -1; // Change ball move direction
				}
				if (ball.getCenterY() < ball.getRadius() || ball.getCenterY() > getHeight() - ball.getRadius()) {
					ball.dy *= -1; // Change ball move direction
				}

				// check for collisions
				// LinkedList<Node> list = (Node) getChildren();
				Collection<Ball> col = new LinkedList<>();
				for (Node b : getChildren()) {
					col.add((Ball) b);
				}
				Iterator<Ball> iter = col.iterator();
				while (iter.hasNext()) {
					Ball b = iter.next();
					double distance = getDistance(b.getCenterX(), b.getCenterY(), ball.getCenterX(), ball.getCenterY());
					double sumRadius = b.getRadius() + ball.getRadius();
					if (distance <= sumRadius && distance != 0) {
						ball.setRadius(ball.getRadius() + b.getRadius());
						getChildren().remove(b);
						iter.remove();
					}
				}

				// Adjust ball position
				ball.setCenterX(ball.dx + ball.getCenterX());
				ball.setCenterY(ball.dy + ball.getCenterY());
			}
		}

		public double getDistance(double x1, double y1, double x2, double y2) {
			double a1 = Math.abs(x2 - x1);
			double a2 = Math.abs(y2 - y1);
			return Math.sqrt(a1 * a1 + a2 * a2);
		}
	}

	class Ball extends Circle {
		private double dx = 1, dy = 1;

		Ball(double x, double y, double radius, Color color) {
			super(x, y, radius);
			setFill(color); // Set ball color
		}

	}

	public static void main(String[] args) {

		launch(args);
	}

	public List<Node> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}
}