import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCheckPassword {

    @Test
    void testCheckLength_Fail(){
        // given
        String password = "1234567";
        // when
        boolean actual = CheckPassword.checkLength(password);
        // then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void testCheckLength_Pass(){
        // given
        String password = "12345678";
        // when
        boolean actual = CheckPassword.checkLength(password);
        // then
        Assertions.assertEquals(true, actual);
    }
    @Test
    void testCheckDigits_Fail(){
        // given
        String password = "jklasjd";
        // when
        boolean actual = CheckPassword.checkDigits(password);
        // then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void testCheckDigits_Pass(){
        // given
        String password = "1233423";
        // when
        boolean actual = CheckPassword.checkDigits(password);
        // then
        Assertions.assertEquals(true, actual);
    }

    @Test
    void testCheckUpperLowerCase_FailLower(){
        // given
        String password = "kkkkkkk";
        // when
        boolean actual = CheckPassword.checkUpperLowerCase(password);
        // then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void testCheckUpperLowerCase_FailUpper(){
        // given
        String password = "HSHSJSJS";
        // when
        boolean actual = CheckPassword.checkUpperLowerCase(password);
        // then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void testCheckUpperLowerCase_Pass(){
        // given
        String password = "HSHSjkjJS";
        // when
        boolean actual = CheckPassword.checkUpperLowerCase(password);
        // then
        Assertions.assertEquals(true, actual);
    }
    @Test
    void testCheckNoUnsecureWords_Fail(){
        // given
        String password = "hallo";
        // when
        boolean actual = CheckPassword.checkNoUnsecureWords(password);
        // then
        Assertions.assertEquals(false, actual);
    }
    @Test
    void testCheckNoUnsecureWords_Pass(){
        // given
        String password = "hjsakdh";
        // when
        boolean actual = CheckPassword.checkNoUnsecureWords(password);
        // then
        Assertions.assertEquals(true, actual);
    }
}

