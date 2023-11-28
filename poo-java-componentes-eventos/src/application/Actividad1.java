package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class Actividad1 extends Application{
	Scene scene1;
	Scene scene2;
	
	public void start(Stage PrimaryStage){
		PrimaryStage.setTitle("Titulo");
		
		Label label = new Label("Bienvenido esta es la primer Scene!");
		Button switchScene2 = new Button("ir a scene 2");
		switchScene2HandlerClass handler2 = new switchScene2HandlerClass(PrimaryStage);
		switchScene2.setOnAction(handler2);
		GridPane root1 = new GridPane();
		root1.add(label, 0, 0);
		root1.add(switchScene2, 0, 1);
		scene1 = new Scene(root1, 250,300);
		
		Button switchScene1 = new Button("Volvamos a el primer Scene");
		switchScene1HandlerClass handler1 = new switchScene1HandlerClass(PrimaryStage);
		switchScene1.setOnAction(handler1);
		StackPane root2 = new StackPane();
		root2.getChildren().add(switchScene1);
		scene2 = new Scene(root2, 600,300);
		
		PrimaryStage.setScene(scene1);
        PrimaryStage.show();
	}

	public static void main(String args[]){
		launch(args);
	}

	
	class switchScene1HandlerClass implements EventHandler<ActionEvent>{
		private Stage PrimaryStage;
		
		public switchScene1HandlerClass(Stage stage){
			this.PrimaryStage = stage;
		}
		
		@Override
		public void handle(ActionEvent arg0) {
			PrimaryStage.setScene(scene1);
		}
		
	}
	
	class switchScene2HandlerClass implements EventHandler<ActionEvent>{
		private Stage PrimaryStage;
		
		public switchScene2HandlerClass(Stage stage){
			this.PrimaryStage = stage;
		}
		
		@Override
		public void handle(ActionEvent arg0) {
			PrimaryStage.setScene(scene2);
		}
		
	}
	}

