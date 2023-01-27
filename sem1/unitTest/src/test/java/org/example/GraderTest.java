package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void negativeNumberShouldReturnIllegalException() {
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
            grader.determineLetterGrade(-1);
        });
    }
    @Test
    void zeroShouldReturnF() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(0));
    }
    @Test
    void fifthNineShouldReturnF() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }



    @Test
    void sixtyShouldReturnF() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(60));
    }
    @Test
    void sixtyNineShouldReturnF() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }


    @Test
    void seventyShouldReturnF() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(70));
    }
    @Test
    void seventyNineShouldReturnF() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }



    @Test
    void eightyShouldReturnF() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(80));
    }
    @Test
    void eightyNineShouldReturnF() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }


    @Test
    void ninetyShouldReturnF() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(90));
    }
    @Test
    void ninetyNineShouldReturnF() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }



}