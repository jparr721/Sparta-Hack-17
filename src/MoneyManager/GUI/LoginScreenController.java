package MoneyManager.GUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Jarred on 1/21/17.
 */
public class LoginScreenController implements Initializable {

    @FXML
    private TextField username, password;

    @FXML
    private Button createNew, forgot;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void handleForgotButton(){

    }
}
