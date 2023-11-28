package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene. layout .*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class Actividad4 extends Application {
	@Override
	public void start(Stage stage) {
		// Dias de la semana
		//Se crea el ComboBox y se anade los Items
		GridPane root = new GridPane();
		Label label1 = new Label("Nombre");
		Button boton = new Button("Enviar");
		
		TextField nombre = new TextField();
		Scene scene = new Scene(root, 300, 300);
		root.add(label1, 0, 0);
		root.add(nombre, 1, 0);
		root.add(boton, 2, 0);
		root.setHgap(10);
		root.setVgap(10);
		stage.setScene(scene);
		stage.show();
		
		Alert alerta = new Alert(AlertType.NONE);
		
		EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e)
			{
			//seleccionar el tipo de alerta
			alerta.setAlertType(AlertType.CONFIRMATION);
			//Definir el titulo de la ventana de alertA
			alerta.setTitle("Dialogo de Confirmacion");
			//Definir el encabezado de la alerta
			alerta.setHeaderText(nombre.getText());
			//Mostrar el dialog
			alerta.show();
			}
			
		};
		boton.setOnAction(event1);
		}
		public static void main(String[] args) {
			launch(args);
		}
}
