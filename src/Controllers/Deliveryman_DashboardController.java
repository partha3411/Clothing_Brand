package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Deliveryman_DashboardController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    private void loadUI(String ui) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/FXML/" + ui + ".fxml"));
            // BorderPanefx.setCenter(root);
        } catch (IOException ex) {
            //Logger.getLogger(CustomerDashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadUI(ActionEvent event, String str) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Scenes/" + str + ".fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void LogOutOnClick(ActionEvent event) throws IOException {
        loadUI(event, "Login_Scene");
    }

    @FXML
    void ViewDeliveryQueOnClick(ActionEvent event) throws IOException {
        loadUI(event, "Deliveryman_Orders");
    }

    @FXML
    void ViewDeliveryStausOnClick(ActionEvent event) throws IOException {
        loadUI(event, "Delivery_Status");
    }

    @FXML
    void ViewMessageOnClick(ActionEvent event) throws IOException {
        loadUI(event, "Deliveryman_Message");
    }

    @FXML
    void ViewNotificationOnClick(ActionEvent event) throws IOException {
        loadUI(event, "Deliveryman_Orders");
    }

    @FXML
    void ViewProfileOnClick(ActionEvent event) throws IOException {
        loadUI(event, "Deliveryman_Profile");
    }
}
