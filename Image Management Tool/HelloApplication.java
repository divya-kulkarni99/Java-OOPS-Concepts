package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application   {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Load FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("IMAGE MANAGEMENT TOOL FINAL PROJECT");
        // Create scene
        Scene scene = new Scene(root, 500, 500);
        // Display application
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
