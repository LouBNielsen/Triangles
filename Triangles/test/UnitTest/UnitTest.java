/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        System.out.println("Not a triangle");
        int a = 10;
        int b = 0;
        int c = 10;

        assertEquals(Triangles.triangle(a, b, c), "Not a triangle");
    }

    @Test
    public void isNotATriangle2() {
        System.out.println("Not a triangle 2");
        int a = 5;
        int b = 5;
        int c = 11;

        assertEquals(Triangles.triangle(a, b, c), "Not a triangle");
    }

    @Test
    public void isNotATriangle3() {
        System.out.println("Not a triangle 3");
        int a = 5;
        int b = 5;
        int c = 10;

        assertEquals(Triangles.triangle(a, b, c), "Not a triangle");
    }

    @Test
    public void isAEquilateralTriangle() {
        System.out.println("Equilateral Triangle");
        int a = 5;
        int b = 5;
        int c = 5;

        assertEquals(Triangles.triangle(a, b, c), "Equilateral Triangle");
    }

    @Test
    public void isAIsoscelesTriangle() {
        System.out.println("Isosceles Triangle");
        int a = 5;
        int b = 5;
        int c = 9;

        assertEquals(Triangles.triangle(a, b, c), "Isosceles Triangle");
    }

    @Test
    public void isAScaleneTriangle() {
        System.out.println("Scalene Triangle");
        int a = 10;
        int b = 5;
        int c = 9;

        assertEquals(Triangles.triangle(a, b, c), "Scalene Triangle");
    }
}
