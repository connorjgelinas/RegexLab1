import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by connorjgelinas on 2/19/16.
 */
public class DataValidatorTest {

    @Test
    public void testIsValidUsername(){
        DataValidator validator = new DataValidator();
        String failCaps = "Abcdefg";
        String failLength = "abcdefghijklmnopqrstuvwxyz";
        String failShort = "ab";
        String passOne = "abcdef";
        String passTwo = "connor";

        assertFalse("Usernames with caps should fail", validator.isValidUsername(failCaps));
        assertFalse("Usernames that are too long should fail", validator.isValidUsername(failLength));
        assertFalse("Usernames that are too short should fail", validator.isValidUsername(failShort));
        assertTrue("Usernames with criteria should pass", validator.isValidUsername(passOne));
        assertTrue("Usernames meeting criteria should pass", validator.isValidUsername(passTwo));
    }
}
