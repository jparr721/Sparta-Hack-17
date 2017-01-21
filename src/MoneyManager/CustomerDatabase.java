package MoneyManager;

/**
 * Created by Jarred on 1/21/17.
 */
public class CustomerDatabase {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    private String goal;

    private int budget;

    public CustomerDatabase(){}

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


    public String getuserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }



}
