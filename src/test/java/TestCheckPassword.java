import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCheckPassword {

    @Test
    void testCheckLength_Fail(){
        // given
        String Password = "1234567";
        // when
        boolean actual = CheckPassword.checkLength(Password);
        // then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void testCheckLength_Pass(){
        // given
        String Password = "12345678";
        // when
        boolean actual = CheckPassword.checkLength(Password);
        // then
        Assertions.assertEquals(true, actual);
    }
    @Test
    void testCheckDigits_Fail(){
        // given
        String Password = "jklasjd";
        // when
        boolean actual = CheckPassword.checkDigits(Password);
        // then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void testCheckDigits_Pass(){
        // given
        String Password = "1233423";
        // when
        boolean actual = CheckPassword.checkDigits(Password);
        // then
        Assertions.assertEquals(true, actual);
    }

    @Test
    void testCheckUpperLowerCase_FailLower(){
        // given
        String Password = "kkkkkkk";
        // when
        boolean actual = CheckPassword.checkUpperLowerCase(Password);
        // then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void testCheckUpperLowerCase_FailUpper(){
        // given
        String Password = "HSHSJSJS";
        // when
        boolean actual = CheckPassword.checkUpperLowerCase(Password);
        // then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void testCheckUpperLowerCase_Pass(){
        // given
        String Password = "HSHSjkjJS";
        // when
        boolean actual = CheckPassword.checkUpperLowerCase(Password);
        // then
        Assertions.assertEquals(true, actual);
    }
    @Test
    void testCheckNoUnsecureWords_Fail(){
        // given
        String Password = "hallo";
        // when
        boolean actual = CheckPassword.checkNoUnsecureWords(Password);
        // then
        Assertions.assertEquals(false, actual);
    }
    @Test
    void testCheckNoUnsecureWords_Pass(){
        // given
        String Password = "hjsakdh";
        // when
        boolean actual = CheckPassword.checkNoUnsecureWords(Password);
        // then
        Assertions.assertEquals(true, actual);
    }
}

