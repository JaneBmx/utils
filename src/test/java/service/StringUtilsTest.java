package service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void isPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("1.123123123123123123"));
    }
}