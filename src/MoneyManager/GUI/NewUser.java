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
public class NewUser extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/NewUser.fxml"));

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("New User");
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
