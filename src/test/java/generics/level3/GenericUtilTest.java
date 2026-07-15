package generics.level3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class GenericUtilTest {

    @Test
    void shouldAcceptBothPhonesAndUsePhoneMethod() {
        SmartPhone mySmartphone = new SmartPhone();
        NoSmartPhone myOldNokia = new NoSmartPhone();

        assertDoesNotThrow(() -> {
            GenericUtils.usePhone(mySmartphone);
            GenericUtils.usePhone(myOldNokia);
        });
    }
}
