package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    private Line test1;
    private Line test2;
    private Line test3;
    @BeforeEach
    void setUp() {
        test1=new Line("Line1", new MyPoint(0,0), new MyPoint(4,0));
        test2=new Line("Line2", new MyPoint(0,3), new MyPoint(4,3));
        test3=new Line("Line3", new MyPoint(2,0), new MyPoint(2,-6));

    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void isParallelLines() {
        assertTrue(test1.isParallelLines(test2));
        assertFalse(test1.isParallelLines(test3));
    }

    @Test
    void isPerpendicular() {
        assertTrue(test1.isPerpendicular(test3));
        assertFalse(test1.isPerpendicular(test2));
    }

    @Test
    void equals(){
        assertFalse(test1.equals(test2));
        assertTrue(test1.equals(test1));
    }
}