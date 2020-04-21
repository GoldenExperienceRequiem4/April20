package bsu.comp152;

import javafx.application.Application;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;



public class Main extends Application {


    private TextField promptTextField;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Label promptLabel = new Label("Enter a name");
        promptTextField = new TextField();
        Button clickButton = new Button("Click");
        clickButton.setOnAction(new ClickButtonHandler());
        VBox vbox = new VBox(10, promptLabel, promptTextField);
        Scene scene = new Scene(vbox, 200, 200);
        vbox.setAlignment(Pos.CENTER);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Comp 152 Project 4");
        primaryStage.show();

    }
}
class ClickButtonHandler implements EventHandler<ActionEvent> {
            public void handle(ActionEvent event) {
                TextArea textArea = new TextArea();
                textArea.setPrefColumnCount(20);
                textArea.setPrefRowCount(20);
            }
        }
