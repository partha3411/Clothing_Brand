/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Login_SceneController implements Initializable {

    @FXML
    private TextField email;
    @FXML
    private TextField password;
    @FXML
    private ComboBox designationFx;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        designationFx.getItems().add("Customer");
        designationFx.getItems().add("Deliveryman");
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
    private void loginOnClick(ActionEvent event) throws IOException {
         if (designationFx.getValue().toString().equals("Customer")) {
            loadUI(event, "Customer_Dashboard");
        }
        if (designationFx.getValue().toString().equals("Delivery man")) {
            loadUI(event, "Deliveryman_Dashboard");
        }
    }

}
