package 111

import org.junit.Assert.*

class Module1KtTest {

    @org.junit.Test
    fun sqr() {
        assertEquals(0, sqr(0))
        assertEquals(4, sqr(2))
        assertEquals(9, sqr(-3))
    }

    @org.junit.Test
    fun sqr1() {
        assertEquals(0.0, sqr(0.0), 1e-13)
        assertEquals(4.0, sqr(2.0), 1e-13)
        assertEquals(9.0, sqr(-3.0), 1e-13)
    }

    @org.junit.Test
    fun discriminant() {
        assertEquals(0.0, discriminant(0.0, 0.0, 0.0), 1e-13)
        assertEquals(0.0, discriminant(1.0, -2.0, 1.0), 1e-13)
        assertEquals(1.0, discriminant(1.0, 3.0, 2.0), 1e-13)
    }

    @org.junit.Test
    fun quadraticEquationRoot() {
        assertEquals(2.0, quadraticEquationRoot(1.0, -3.0, 2.0), 1e-13)
        assertEquals(1.0, quadraticEquationRoot(1.0, -2.0, 1.0), 1e-13)
        assertEquals(-3.0, quadraticEquationRoot(1.0, 6.0, 9.0), 1e-13)
    }

    @org.junit.Test
    fun quadraticRootProduct() {
        assertEquals(1.0, quadraticRootProduct(1.0, -2.0, 1.0), 1e-13)
        assertEquals(9.0, quadraticRootProduct(1.0, 6.0, 9.0), 1e-13)
        assertEquals(2.0, quadraticRootProduct(1.0, 3.0, 2.0), 1e-13)
    }

    @org.junit.Test
    fun second() {
        assertEquals(30035, second(8, 20, 35))
        assertEquals(86400, second(24, 0, 0))
        assertEquals(13, second(0, 0, 13))
    }

    @org.junit.Test
    fun train() {
        assertEquals(80, train(21,20,22,40))
        assertEquals(20, train(12,20,12,40))
        assertEquals(60, train(12, 0, 13, 0))
    }

    @org.junit.Test
    fun penny() {
        assertEquals(4550.0, Math.ceil(penny(45.5)), 1e-13)
        assertEquals(1000.0, Math.ceil(penny(10.0)), 1e-13)
        assertEquals(1050.0, Math.ceil(penny(10.5)), 1e-13)
    }

    @org.junit.Test
    fun book() {
        assertEquals(1068750, book(1, 2 ,1))
        assertEquals(393750, book(0,1,3))
        assertEquals(562500, book(1,0,0))
    }

    @org.junit.Test
    fun thirdDigit() {
        assertEquals(8, thirdDigit(3801))
        assertEquals(1, thirdDigit(100))
        assertEquals(0, thirdDigit(1000))
    }

    @org.junit.Test
    fun numberRevert() {
        assertEquals(874, numberRevert(478))
        assertEquals(201, numberRevert(102))
    }
}