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
    private  Graph<Integer> tmp4;
    private  Graph<Integer> tmp5;
    private  Graph<Integer> tmp6;
    @BeforeEach
    void setUp() {
        tmp1= new Graph<Integer>(1);
        tmp2= new Graph<Integer>(2);
        tmp3= new Graph<Integer>(3);
        tmp4= new Graph<Integer>(4);
        tmp5= new Graph<Integer>(5);
        tmp6= new Graph<Integer>(6);
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
    @Test
    void ega(){
        tmp1.add(tmp2);
        tmp1.add(tmp3);
        tmp2.add(tmp4);
        tmp3.add(tmp4);
        tmp3.add(tmp5);
        tmp4.add(tmp5);
        tmp4.add(tmp6);
        tmp5.add(tmp6);
        System.out.println(tmp1.ega(tmp6));
    }

}