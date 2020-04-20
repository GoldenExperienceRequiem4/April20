package bsu.comp152;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
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
        VBox vbox = new VBox(10,promptLabel, clickButton);
        Scene scene = new Scene(vbox, 300, 300);


    }
}
