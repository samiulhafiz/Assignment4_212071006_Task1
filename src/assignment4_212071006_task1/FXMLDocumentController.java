/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package assignment4_212071006_task1;

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
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 *
 * @author samiul
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private ToggleGroup gender;
    @FXML
    private TextField namefield;
    @FXML
    private TextField emailfield;
    @FXML
    private PasswordField passwordfield;
    @FXML
    private DatePicker birthdatefield;
    @FXML
    private RadioButton malefield;
    @FXML
    private RadioButton femalefield;
    @FXML
    private RadioButton othersfield;
    @FXML
    private TextField cityfield;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        String name = namefield.getText();
        String password = passwordfield.getText();
        String email = emailfield.getText();
        String birthdate = "";
        if (birthdatefield.getValue() != null) {
            birthdate = birthdatefield.getValue().toString();
        }

        RadioButton selectedGender = (RadioButton) gender.getSelectedToggle();
        String gender = selectedGender.getText();

        String city = cityfield.getText();

        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Gender: " + gender);
        System.out.println("City: " + city);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));
        DashboardController dashboardController = new DashboardController(name, email, birthdate, gender, city);
        loader.setController(dashboardController);

        try {
            Parent root = loader.load();
            
            Scene scene = new Scene(root);
            
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.setScene(scene);
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
