package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAdd() {
        App app = new App();
        
        // Test cases for add method
        assertEquals(5, app.add(2, 3), "2 + 3 should be 5");
        assertEquals(0, app.add(0, 0), "0 + 0 should be 0");
        assertEquals(-5, app.add(-2, -3), "-2 + -3 should be -5");
        assertEquals(10, app.add(5, 5), "5 + 5 should be 10");
    }
}