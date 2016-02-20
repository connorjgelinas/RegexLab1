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
        String passThree = "abc";

        assertFalse("Usernames with caps should fail", validator.isValidUsername(failCaps));
        assertFalse("Usernames that are too long should fail", validator.isValidUsername(failLength));
        assertFalse("Usernames that are too short should fail", validator.isValidUsername(failShort));
        assertTrue("Usernames with criteria should pass", validator.isValidUsername(passOne));
        assertTrue("Usernames meeting criteria should pass", validator.isValidUsername(passTwo));
        assertTrue("Usernames of exactly 3 characters should pass", validator.isValidUsername(passThree));
    }

    @Test
    public void testIsValidEnhancedUsername() {
        DataValidator validator = new DataValidator();
        String failUnderscore = "_bcdefg";
        String failLength = "abcdefghijklmnopqrstuvwxyz";
        String failShort = "ab";
        String passOne = "abc_def";
        String passTwo = "connor";
        String passThree = "connor_";
        String passFour = "abc";

        assertFalse("Usernames starting with _ should fail", validator.isValidEnhancedUsername(failUnderscore));
        assertFalse("Usernames that are too long should still fail", validator.isValidEnhancedUsername(failLength));
        assertFalse("usernames that are too short should fail", validator.isValidEnhancedUsername(failShort));
        assertTrue("Usernames with underscores should pass", validator.isValidEnhancedUsername(passOne));
        assertTrue("Usernames with underscores at the end should pass", validator.isValidEnhancedUsername(passTwo));
        assertTrue("Usernames without _ that meet other criteria should pass", validator.isValidEnhancedUsername(passThree));
        assertTrue("Usernames of exactly 3 characters should pass", validator.isValidUsername(passFour));

    }
}
