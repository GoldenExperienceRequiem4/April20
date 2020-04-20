package bsu.comp152;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;


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
        HBox hbox = new HBox(10, promptLabel, promptTextField);
        
    }
}
