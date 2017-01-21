package MoneyManager.GUI;

import MoneyManager.CustomerDatabase;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
public class LoginScreenController implements Initializable {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button createNew, forgot, login;

    CustomerDatabase customer = new CustomerDatabase();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void handleForgotButton(){

    }

    @FXML
    public void handleLoginButton(){

        if (customer.checkLogin(username.getText(), password.getText())== true){

            try {
                Parent root = FXMLLoader.load(
                        getClass().getResource("/MainMenu.fxml"));

                Scene scene = new Scene(root);

                Stage newStage = new Stage();

                newStage.setScene(scene);
                newStage.setTitle("Main Menu");
                newStage.setResizable(false);
                newStage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR!");
            alert.setHeaderText("Incorrect Password");
            alert.setContentText("The two passwords you have entered do not match!");

            alert.showAndWait();
        }
    }

    @FXML
    public void handleNewUserButton(){
        try {

            Parent root = FXMLLoader.load(
                    getClass().getResource("/NewUser.fxml"));

            Scene scene = new Scene(root);

            Stage newStage = new Stage();

            newStage.setScene(scene);
            newStage.setTitle("New User");
            newStage.setResizable(false);
            newStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
