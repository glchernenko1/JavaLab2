package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    private Matrix test1;
    private Matrix test2;
    private Matrix test3;
    private Matrix test4;
    private Matrix test5;
    private Matrix test6;
    private Matrix test7;
    private Matrix test8;
    private Matrix test9;
    private Matrix test10;
    private Matrix test11;

    @BeforeEach
    void setUp() {
        test1 = new Matrix(3, 3, new double[][]{{1, 0, 0}, {1, 2, 0}, {1, 2, 3}});
        test2 = new Matrix(3, 3, new double[][]{{1, 2, 3}, {0, 2, 3}, {0, 0, 3}});
        test3 = new Matrix(3, 3, new double[][]{{1, 0, 0}, {0, 2, 0}, {0, 0, 3}});
        test4 = new Matrix(3, 4, new double[][]{{2, 0, 0, 0}, {0, 2, 0, 3}, {0, 0, 3, 1}});
        test5 = new Matrix(2, 2, new double[][]{{0, 0}, {0, 0}});
        test6 = new Matrix(2, 2, new double[][]{{1, 1}, {1, 1}});
        test7 = new Matrix(3, 3, new double[][]{{1, 2, 3}, {1, 6, 9}, {1, 6, 18}});
        test8 = new Matrix(3, 3, new double[][]{{1, 2, 3}, {2, 7, 4}, {3, 4, 18}});
        test9 = new Matrix(1, 4, new double[][]{{1, 2, 3, 4}});
        test10 = new Matrix(4, 1, new double[][]{{1}, {2}, {3}, {4}});
        test11 = new Matrix(1, 1, new double[][]{{30}});
    }

    @Test
    void isDownTriangular() {


        assertTrue(test1.isDownTriangular());
        assertFalse(test2.isDownTriangular());
    }

    @Test
    void isUpTriangular() {

        assertFalse(test1.isUpTriangular());
        assertTrue(test2.isUpTriangular());
    }

    @Test
    void isDiag() {
        assertFalse(test1.isDiag());
        assertTrue(test3.isDiag());
    }

    @Test
    void isNull() {
        assertFalse(test1.isNull());
        assertTrue(test5.isNull());
    }

    @Test
    void isOne() {
        assertFalse(test1.isOne());
        assertTrue(test6.isOne());
    }

    @Test
    void iseEuals() {
        assertTrue(test4.isEuals(test4));
        assertFalse(test4.isEuals(test1));
    }

    @Test
    void multiply() {
        assertTrue(test5.isEuals(test6.multiply(0)));
    }

    @Test
    void testMultiply() {
        assertTrue(test5.isEuals(test6.multiply(test5)));
        assertTrue(test1.multiply(test2).isEuals(test7));
        assertTrue(test9.multiply(test10).isEuals(test11));

    }

    @Test
    void testSymmetrical() {
        assertTrue(test8.isSymmetrical());
        assertFalse(test2.isSymmetrical());

    }


}
