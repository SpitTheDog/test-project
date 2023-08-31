package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void getLargeString_shouldReturnUppercase_whenLowerCaseInput() {
        Main main = new Main();
        assertEquals("HELLO", main.getLargeString("hello"));
    }
    @Test
    public void getLittleString_shouldReturnLowercase_whenUpperCaseInput() {
        Main main = new Main();
        assertEquals("bon jour", main.getLittleString("BON JOUR"));
    }

}