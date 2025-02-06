package org.vincent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperAndLowerCaseTest {

    @Test
    void caseConverter() {
        assertEquals(
                "tHE qUIcK bRoWn fOX",
                UpperAndLowerCase.caseConverter("The QuiCk BrOwN Fox")
        );
        assertEquals(
                "eeeee aaaaaaa",
                UpperAndLowerCase.caseConverter("EEEEE AAAAAAA")
        );
        assertEquals(
                "mALaM KeOs INyEeH",
                UpperAndLowerCase.caseConverter("MalAm kEoS inYeEh")
        );
    }
}