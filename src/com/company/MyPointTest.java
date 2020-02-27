package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyPointTest {
    private MyPoint test1;
    private MyPoint test2;
    private MyPoint test3;
    private MyPoint test4;

    @BeforeEach
    void setUp() {
        test1 = new MyPoint(2, 2);
        test2 = new MyPoint(1, 2);
        test3 = new MyPoint(0, 2);
        test4 = new MyPoint(0, -2);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getX() {
        assertTrue(test1.getX() == 2);
        assertTrue(test2.getX() == 1);
        System.out.println("getX: ok ");
    }

    @Test
    void getY() {
        assertTrue(test1.getY() == 2);
        assertTrue(test2.getY() == 2);
        System.out.println("getY: ok ");
    }

    @Test
    void move() {
        test1.move(1, 1);
        assertTrue(Math.abs(test1.getX() - test2.getX())< 1E-10);
        assertFalse(Math.abs(test1.getY() - test2.getY())<1E-10);
        System.out.println("move: ok ");
    }

    @Test
    void distance() {
        assertTrue(test1.distance(test1) < 1E-10);
        assertTrue(Math.abs(test3.distance(new MyPoint()) - 2) < 1E-10);
        assertTrue(Math.abs(test4.distance(new MyPoint()) - test3.distance(new MyPoint())) < 1E-10);
        assertTrue(Math.abs(new MyPoint().distance(test1)-test1.distance(new MyPoint()))<1E-10);
        System.out.println("distance: ok ");
    }

    @Test
    void testEquals() {
        assertTrue(test1.equals(test1));
        assertFalse(test1.equals(test4));
        System.out.println("equals: ok ");
    }

    @Test
    void getLocation() {
        assertTrue(test1.equals(test1.getLocation()));
        assertFalse(test3.equals(test4));
        System.out.println("getLocation: ok ");
    }


}