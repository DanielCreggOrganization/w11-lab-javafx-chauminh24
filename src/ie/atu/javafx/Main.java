package ie.atu.javafx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // This method is where we'll begin building our UI
        Label welcomeLabel = new Label("Welcome, Minh Chau!");
        welcomeLabel.setStyle("-fx-font-size: 20px;");

        Label dateLabel = new Label(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        
        // Create a container to hold our label
        VBox vbox = new VBox(10, welcomeLabel, dateLabel);
        
        // Create and configure the scene
        Scene scene = new Scene(vbox, 300, 200);
        
        // Configure and show the stage
        primaryStage.setTitle("Welcome to My App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

