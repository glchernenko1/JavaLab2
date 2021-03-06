package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    private  MyStack<Double> test1;

    @BeforeEach
    void setUp() {
        test1 = new MyStack<Double>();
    }

    @Test
    void push() {
        test1.push(3.1415);
        assertFalse(test1.isEmpty());
        assertEquals(test1.peak(), 3.1415, 1E-5);
        test1.push(-2.);
        assertEquals(test1.peak(), -2., 1E-5);

    }

    @Test
    void isEmpty() {
        assertTrue( test1.isEmpty());
        test1.push(3.1415);
        assertFalse(test1.isEmpty());
    }

    @Test
    void pop() {
        test1.push(3.1415);
        test1.push(-2.);
        test1.pop();
        assertEquals(test1.peak(), 3.1415, 1E-5);
        test1.pop();
        Exception exception = assertThrows(IndexOutOfBoundsException.class,()->test1.pop());
        assertEquals("Stack empty", exception.getMessage());


    }

}