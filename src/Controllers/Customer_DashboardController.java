package Controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Customer_DashboardController {

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
    void logoutOnClick(ActionEvent event) throws IOException {
        loadUI(event, "Login_Scene");
    }

    @FXML
    void ViewActivitiesOnClick(ActionEvent event) throws IOException {
        loadUI(event, "Activity");
    }

    @FXML
    void ViewCartOnClick(ActionEvent event) throws IOException {
        loadUI(event, "Cart");
    }

    @FXML
    void ViewCustomerCareOnClick(ActionEvent event) throws IOException {
        loadUI(event, "Customer_Care");
    }

    @FXML
    void ViewNewOnClick(ActionEvent event) throws IOException {
        loadUI(event, "News");
    }

    @FXML
    void ViewShopOnClick(ActionEvent event) throws IOException {
        loadUI(event, "shop");
    }

    @FXML
    void viewProfileOnClick(ActionEvent event) throws IOException {
        loadUI(event, "Login_Scene");
    }

    @FXML
    void backOnClick(ActionEvent event) throws IOException {
        loadUI(event, "Customer_Dashboard");
    }

}
