import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

    @Test
    void testSingleLetter() {
        assertEquals(1, RomanToInteger.romanToInt("I"));
        assertEquals(5, RomanToInteger.romanToInt("V"));
        
    }

    @Test
    void testManyLetters() {
        assertEquals(29, RomanToInteger.romanToInt("XXIX"));
        assertEquals(30, RomanToInteger.romanToInt("XXX"));
 
    }
    
    @Test
    void substractiveNotation() {
        assertEquals(4, RomanToInteger.romanToInt("IV"));
    }
    
    @Test
    void withAndWithoutSN() {
        assertEquals(14, RomanToInteger.romanToInt("XIV"));
    }
    
    @Test
    void testFirstNumber() {
        assertEquals(1, RomanToInteger.romanToInt("I"));
    }
    
    @Test
    void testRepetition() {
        assertEquals(2, RomanToInteger.romanToInt("II"));
        assertEquals(3, RomanToInteger.romanToInt("III"));
    }


    @Test
    void testInvalidLetter() {
        assertThrows(IllegalArgumentException.class, () -> RomanToInteger.romanToInt("Z"));
        assertThrows(IllegalArgumentException.class, () -> RomanToInteger.romanToInt("!"));
    }
    
    @Test
    void testInvalidAndValid() {
    	assertThrows(IllegalArgumentException.class, () -> RomanToInteger.romanToInt("XIZ"));
    }
    
    @Test
    void testNotValid() {
    	assertThrows(IllegalArgumentException.class, () -> RomanToInteger.romanToInt("vv"));
    }

    @Test
    void testNull() {
        assertThrows(IllegalArgumentException.class, () -> RomanToInteger.romanToInt(null));
    }
}
