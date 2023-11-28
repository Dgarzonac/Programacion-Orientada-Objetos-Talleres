package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;


public class Actividad2 extends Application {
	Scene scene1;
	Scene scene2;
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Transicion menus");
		
		MenuBar barraMenu = new MenuBar();
		Menu menu1 = new Menu("Opciones");
		barraMenu.getMenus().add(menu1);
		MenuItem menuItem1 = new MenuItem("Escena 2");
		menu1.getItems().add(menuItem1);
		VBox root1 = new VBox(barraMenu);
		Label label1 = new Label("Escena 1");
		root1.getChildren().addAll(label1);
		scene1 = new Scene(root1, 300,200);
		
		MenuBar barraMenu2 = new MenuBar();
		Menu menu2 = new Menu("Opciones");
		barraMenu2.getMenus().add(menu2);
		MenuItem menuItem2 = new MenuItem("Escena 1");
		menu2.getItems().add(menuItem2);
		VBox root2 = new VBox(barraMenu2);
		Label label2 = new Label("Escena 2");
		root2.getChildren().addAll(label2);
		scene2 = new Scene(root2, 300,200);
		
		UnicoHandlerClass handler = new UnicoHandlerClass(primaryStage);
		menuItem1.setOnAction(handler);
		menuItem2.setOnAction(handler);
		
		primaryStage.setScene(scene1);
		primaryStage.show();
	}
	
	public static void main(String args[]){
		launch(args);
	}
	
	class UnicoHandlerClass implements EventHandler<ActionEvent>{
		
		private Stage primaryStage;
		
		public UnicoHandlerClass(Stage primaryStage) {
			this.primaryStage = primaryStage;
		}

		@Override
		public void handle(ActionEvent e) {
			Object control = e.getSource();
			if(control instanceof MenuItem){
				MenuItem menuItem = (MenuItem) control;
				if(menuItem.getText().equals("Escena 2")){
					// Cambiar a escena2
					primaryStage.setScene(scene2);
				}
				if(menuItem.getText().equals("Escena 1")){
					// Cambiar a escena1
					primaryStage.setScene(scene1);
					
				}
			}
		}
		
	}
}