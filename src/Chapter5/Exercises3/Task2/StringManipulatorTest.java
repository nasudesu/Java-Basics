package Chapter5.Exercises3.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringManipulatorTest {

    @Test
    void canConcatenate(){
        StringManipulator stringManipulator = new StringManipulator();
        String str1 = "Hei!";
        String str2 = "Käyttäjä";
        assertEquals(str1 + " " + str2, stringManipulator.concatenate(str1, str2));
    }

    @Test
    void canFindLength(){
        StringManipulator stringManipulator = new StringManipulator();
        String lenght = "Pituus";
        assertEquals(lenght.length(), stringManipulator.findLength(lenght));
    }

    @Test
    void canConvertToUpperCase(){
        StringManipulator stringManipulator = new StringManipulator();
        String str = "Hei!";
        assertEquals(str.toUpperCase(), stringManipulator.convertToUpperCase(str));
    }

    @Test
    void canConvertToLowerCase(){
        StringManipulator stringManipulator = new StringManipulator();
        String str = "Hei!";
        assertEquals(str.toLowerCase(), stringManipulator.convertToLowerCase(str));
    }

    @Test
    void canContainsSubstring(){
        StringManipulator stringManipulator = new StringManipulator();
        String str = "Hei!";
        String subStr = "hei!";
        assertEquals(str.equalsIgnoreCase(subStr), stringManipulator.containsSubstring(str, subStr));
    }
}
