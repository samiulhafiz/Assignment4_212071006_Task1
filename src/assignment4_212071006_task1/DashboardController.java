/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package assignment4_212071006_task1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author samiul
 */
public class DashboardController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label birthdateLabel;
    @FXML
    private Label genderLabel;
    @FXML
    private Label cityLabel;
 
    private String name;
    private String email;
    private String birthdate;
    private String gender;
    private String city;

    public DashboardController(String name, String email, String birthdate, String gender, String city) {
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
        this.gender = gender;
        this.city = city;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
        nameLabel.setText("Name: " + name);
        emailLabel.setText("Email: " + email);
        birthdateLabel.setText("Birthdate: " + birthdate);
        genderLabel.setText("Gender: " + gender);
        cityLabel.setText("City: " + city);
    }
}
