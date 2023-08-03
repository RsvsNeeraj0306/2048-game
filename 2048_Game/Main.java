package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane for the 4x4 table
        GridPane gridPane = new GridPane();

        // Add cells to the GridPane
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                Color color = (row + col) % 2 == 0 ? Color.LIGHTGRAY : Color.WHITE;
                Rectangle cell = new Rectangle(100, 100, color);
                gridPane.add(cell, col, row);
            }
        }

        // Add padding to the GridPane
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new javafx.geometry.Insets(10));

        // Create a Scene and set it on the Stage
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("4x4 Table using GridPane");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
