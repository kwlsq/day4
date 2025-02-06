package org.vincent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MultiplicationTest {

    @Test
    @DisplayName("Multiplicator test with valid inputs")
    void multiplicator() {
        assertEquals("1 2 3 4 5\n2 4 6 8 10\n3 6 9 12 15\n4 8 12 16 20\n5 10 15 20 25\n",
                Multiplication.multiplicator(5));
        assertEquals("1 2\n2 4\n",
                Multiplication.multiplicator(2));
    }
}