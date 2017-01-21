package MoneyManager;

import javafx.scene.control.Alert;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Jarred on 1/21/17.
 */
public class CustomerDatabase {

    /** Strings to store the user data **/
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String fullName;

    /** Amount of money that the user has available **/
    private int budget;

    /**
     * New HashMap object to store the user information,
     * this is will allow it to be accessible in a simple format
     * with a single variable
     */
    public HashMap<String, String> userData = new HashMap<String, String>();

    /************************************************
     * Constructor to initialize instance variables
     ************************************************/
    public CustomerDatabase(){
        username = "";
        password = "";
        firstName = "";
        lastName = "";
    }

    /************************************************************************
     * Getters and setters for all of the necessary User information variables
     * @return
     ***********************************************************************/
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    /************************************************************************
     * Takes the user input in as parameters and stores it within the Hash Map
     * for easy access in other parts of the code by a single address
     * @param first - User's first name
     * @param last - User's last name
     * @param username - Username of the user
     * @param password - Password of the user
     ***********************************************************************/
    public void newCustomer(String first, String last, String username, String password){

        fullName = firstName + " " + lastName;

        String customerData = first + " " + last + " " + username + " " + password;
        userData.put(fullName, customerData);

        try {
            PrintWriter out = new PrintWriter("userInfo.txt");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public boolean checkLogin(String username, String password){

        File file = new File("userInfo.txt");

        try {
            Scanner scanner = new Scanner(file);

            //read the file line by line
            int lineNum = 0;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                lineNum++;
                if (line.contains(username) && line.contains(password)){
                    return true;
                }
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR!");
            alert.setHeaderText("File Does Not Exist!");
            alert.setContentText("The file you are looking for cannot be found.");

            alert.showAndWait();
        }

        return false;

    }


}
