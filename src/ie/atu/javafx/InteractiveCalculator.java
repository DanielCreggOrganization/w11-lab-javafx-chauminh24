package ie.atu.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InteractiveCalculator extends Application{
    private Label display = new Label("0");
    private String currentOperation ="";
    private double result = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create display
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25));

        grid.add(display, 0, 0, 4, 1);

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };
        
        int row =1;
        int col = 0;
        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.setStyle("-fx-font-size: 20px;");
            button.setMinSize(50, 50);
            button.setOnAction(e -> handleButtonClick(label));
            grid.add(button, col, row);
            col++;
            if (col == 4) { // Move to next row after 4 buttons
                col = 0;
                row++;
            }
        }

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setTitle("Interactive Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
    private void handleButtonClick(String label) {
            //Codes here
    }
    public static void main(String[] args) {
        launch(args);
    }
}