import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCheckPassword {

    @Test
    void testCheckPasswordLength_7(){

        // given
        String Password = "1234567";

        // when
        boolean actual = CheckPassword.checkPasswordLength(Password);

        // then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void testCheckPasswordLength_8(){

        // given
        String Password = "12345678";

        // when
        boolean actual = CheckPassword.checkPasswordLength(Password);

        // then
        Assertions.assertEquals(true, actual);
    }
}
