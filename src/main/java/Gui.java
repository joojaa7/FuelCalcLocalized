import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ResourceBundle;

public class Gui extends Application {

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("hello-view.fxml"));
        fxmlLoader.setResources(ResourceBundle.getBundle("message"));
        Parent root = fxmlLoader.load();
        stage.setScene(new Scene(root));
        stage.setTitle("Mikael Asikainen");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
