import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class CampusMap extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Main Pane
        VBox root = new VBox();

        // App Title
        Label titleLabel = new Label("Campus Navigation App");
        root.getChildren().add(titleLabel);

        // Search Bar
        TextField searchBar = new TextField();
        searchBar.setPromptText("Search for Building/Facility/Amenity");
        root.getChildren().add(searchBar);

        // Search Button
        Button searchButton = new Button("Search");
        root.getChildren().add(searchButton);

        // (Replace with actual map once you choose a map provider)
        Label mapPlaceholder = new Label("Map will be displayed here");
        root.getChildren().add(mapPlaceholder);

        // Scene Setup
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Campus Map");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

