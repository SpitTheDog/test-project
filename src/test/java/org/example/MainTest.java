package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void getString_shouldReturnUppercase_whenLowerCaseInput() {
        Main main = new Main();
        assertEquals("HELLO", main.getString("hello"));
    }

}