import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class CampusMap extends Application {

    private String apiKey = "YOUR_API_KEY"; // Replace with your Google Maps API Key

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

        // WebView for Google Map
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        root.getChildren().add(webView);

        // Search functionality
        searchButton.setOnAction(event -> {
            String searchTerm = searchBar.getText();
            String baseUrl = "https://www.google.com/maps/embed/v1/place?key=" + apiKey + "&q=";
            String searchUrl = baseUrl + searchTerm + "&zoom=17"; // Adjust zoom level as needed
            webEngine.load(searchUrl);
        });

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

