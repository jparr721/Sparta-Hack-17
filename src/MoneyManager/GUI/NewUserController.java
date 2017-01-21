package MoneyManager.GUI;

import MoneyManager.CustomerDatabase;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Jarred on 1/21/17.
 */
public class NewUserController implements Initializable {

    @FXML private TextField firstNameField, lastNameField, usernameField;

    @FXML private PasswordField passwordField, confirmField;

    @FXML private Button closeButton, doneButton;

    CustomerDatabase customer = new CustomerDatabase();

    private String firstName, lastName, username, password, passwordConfirm;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void newUserAuthentification(){
        firstName = firstNameField.getText();
        lastName = lastNameField.getText();
        username = usernameField.getText();
        password = passwordField.getText();
        passwordConfirm = confirmField.getText();

        if (!(password.equals(passwordConfirm))){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR!");
            alert.setHeaderText("Incorrect Password");
            alert.setContentText("The two passwords you have entered do not match!");

            alert.showAndWait();
        }

        customer.newCustomer(firstName, lastName, username, password);

        Stage stage = (Stage) doneButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    public void handleCloseButton(){
        //Get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        //Close the window
        stage.close();
    }

}
