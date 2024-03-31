
package cloting_brand;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Cloting_Brand extends Application {
    
 @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("/Scenes/Login_Scene.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } 
    public static void main(String[] args) {
        launch(args);
    }
}
