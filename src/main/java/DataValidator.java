/**
 * Created by connorjgelinas on 2/19/16.
 */
public class DataValidator {

    public boolean isValidUsername(String userInput) {
        return userInput.matches("[a-z]{3,25}");
    }
}
