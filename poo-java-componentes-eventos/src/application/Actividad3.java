package application;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Actividad3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Eventos del raton");
        label.setStyle("-fx-font-size: 20;");

        MouseClickHandler handler = new MouseClickHandler(label);

        label.setOnMouseClicked(handler);

        VBox root = new VBox(10);
        root.getChildren().addAll(label);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class MouseClickHandler implements EventHandler<MouseEvent> {
    private Label label;

    public MouseClickHandler(Label label) {
        this.label = label;
    }

    @Override
    public void handle(MouseEvent event) {
        label.setText("Lo clickeo");
        label.setStyle("-fx-text-fill: red; -fx-font-size: 20;");
    }
}
