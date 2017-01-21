package MoneyManager;

/**
 * Created by Jarred on 1/21/17.
 */
public class CustomerDatabase {

    private String fullName;

    private String goal;

    private int budget;

    public CustomerDatabase(String first, String last, String userName,
                            String password){

        fullName = first + " " + last;

    }
}
