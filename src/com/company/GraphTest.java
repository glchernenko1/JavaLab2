package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    private  Graph<Integer> tmp1;
    private  Graph<Integer> tmp2;
    private  Graph<Integer> tmp3;
    @BeforeEach
    void setUp() {
        tmp1= new Graph<Integer>(10);
        tmp2= new Graph<Integer>(11);
        tmp3= new Graph<Integer>(9);
    }


    @Test
    void add() {
        tmp1.add(tmp2);
        assertEquals(tmp1.getSize(),1);
        tmp1.add(tmp3);
        assertEquals(tmp1.getSize(),2);
    }

    @Test
    void del() {
        tmp1.add(tmp2);
        tmp1.add(tmp3);
        tmp1.del(tmp2);
        assertEquals(tmp1.getSize(),1);

    }

    @Test
    void isAlone() {
        assertTrue(tmp1.isAlone());
        tmp1.add(tmp2);
        assertFalse(tmp1.isAlone());
    }
    @Test
    void  isFiend(){
        tmp1.add(tmp2);
        tmp1.add(tmp3);
        tmp1.isFinde(tmp2);
        assertTrue(tmp1.isFinde(tmp2));
        tmp1.del(tmp2);
        tmp1.isFinde(tmp2);
        assertFalse(tmp1.isFinde(tmp2));

    }
}