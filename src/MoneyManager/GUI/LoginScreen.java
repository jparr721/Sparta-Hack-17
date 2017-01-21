package MoneyManager.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Jarred on 1/21/17.
 */
public class LoginScreen extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/LoginScreen.fxml"));

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Please Log In");
            primaryStage.setResizable(false);
            primaryStage.show();
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){

        launch(args);
    }
}
