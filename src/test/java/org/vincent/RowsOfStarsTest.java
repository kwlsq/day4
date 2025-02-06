package org.vincent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowsOfStarsTest {

    @Test
    void starsGenerators() {
        assertEquals("*\n**\n***\n****\n*****\n",
                RowsOfStars.starsGenerators());
    }
}