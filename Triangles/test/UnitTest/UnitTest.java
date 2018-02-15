/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import org.junit.Test;
import static org.junit.Assert.*;
import triangles.Triangles;

/**
 *
 * @author Louise Nielsen
 */
public class UnitTest {

    public UnitTest() {
    }

    @Test
    public void isNotATriangle() {
        System.out.println("Not a triangle test with a <= 0");
        int a = -1;
        int b = 10;
        int c = 10;

        assertEquals(Triangles.triangle(a, b, c), "Not a triangle");
    }

    @Test
    public void isNotATriangle2() {
        System.out.println("Not a triangle test with b <= 0");
        int a = 10;
        int b = 0;
        int c = 10;

        assertEquals(Triangles.triangle(a, b, c), "Not a triangle");
    }

    @Test
    public void isNotATriangle3() {
        System.out.println("Not a triangle test with c <= 0");
        int a = 15;
        int b = 10;
        int c = 0;

        assertEquals(Triangles.triangle(a, b, c), "Not a triangle");
    }

    @Test
    public void isNotATriangle4() {
        System.out.println("Not a triangle test with (a + b) <= c");
        int a = 5;
        int b = 5;
        int c = 10;

        assertEquals(Triangles.triangle(a, b, c), "Not a triangle");
    }

    @Test
    public void isNotATriangle5() {
        System.out.println("Not a triangle test with (a + c) <= b");
        int a = 5;
        int b = 11;
        int c = 5;

        assertEquals(Triangles.triangle(a, b, c), "Not a triangle");
    }

    @Test
    public void isNotATriangle6() {
        System.out.println("Not a triangle test with (b + c) <= a");
        int a = 10;
        int b = 5;
        int c = 5;

        assertEquals(Triangles.triangle(a, b, c), "Not a triangle");
    }

    @Test
    public void isAEquilateralTriangle() {
        System.out.println("Equilateral Triangle test with a == b && b == c");
        int a = 5;
        int b = 5;
        int c = 5;

        assertEquals(Triangles.triangle(a, b, c), "Equilateral Triangle");
    }

    @Test
    public void isAIsoscelesTriangle() {
        System.out.println("Isosceles Triangle test with a == b");
        int a = 5;
        int b = 5;
        int c = 9;

        assertEquals(Triangles.triangle(a, b, c), "Isosceles Triangle");
    }

    @Test
    public void isAIsoscelesTriangle2() {
        System.out.println("Isosceles Triangle test with b == c");
        int a = 17;
        int b = 9;
        int c = 9;

        assertEquals(Triangles.triangle(a, b, c), "Isosceles Triangle");
    }

    @Test
    public void isAIsoscelesTriangle3() {
        System.out.println("Isosceles Triangle test with c == a");
        int a = 2;
        int b = 1;
        int c = 2;

        assertEquals(Triangles.triangle(a, b, c), "Isosceles Triangle");
    }

    @Test
    public void isAScaleneTriangle() {
        System.out.println("Scalene Triangle test with a != b && b != c");
        int a = 10;
        int b = 5;
        int c = 9;

        assertEquals(Triangles.triangle(a, b, c), "Scalene Triangle");
    }
}
