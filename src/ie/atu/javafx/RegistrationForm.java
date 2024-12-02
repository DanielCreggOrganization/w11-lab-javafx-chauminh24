package ie.atu.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class RegistrationForm extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a grid layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25));


        // Add form elements
        Label firstnameLabel = new Label("First Name:");
        grid.add(firstnameLabel, 0, 0); // column 0, row 0
        
        TextField firstnameField = new TextField();
        grid.add(firstnameField, 1, 0); // column 1, row 0

        Label lastnameLabel = new Label("Last Name:");
        grid.add(lastnameLabel, 0, 1); // column 1, row 0
        
        TextField lastnameField = new TextField();
        grid.add(lastnameField, 1, 1); // column 1, row 1

        Label emailLabel = new Label("Email:");
        grid.add(emailLabel, 0, 2); // column 0, row 2
        
        TextField emailField = new TextField();
        grid.add(emailField, 1, 2); // column 1, row 2
        
        Label passwordLabel = new Label("Password:");
        grid.add(passwordLabel, 0, 3); // column 0, row 3
        
        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 3); // column 1, row 3

        Label confirmLabel = new Label("Confirm:");
        grid.add(confirmLabel, 0, 4); // column 0, row 4
        
        PasswordField confirmField = new PasswordField();
        grid.add(confirmField, 1, 4); // column 1, row 4
        
        Button loginButton = new Button("Register");
        grid.add(loginButton, 1, 5); // column 1, row 5
        
        // Create scene and show
        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}