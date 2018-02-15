/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangles;

import java.util.Scanner;

/**
 *
 * @author Louise Nielsen
 */
public class Triangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(triangle(a, b, c));
    }

    public static String triangle(int a, int b, int c) {
        String triangle = "";

        if (a <= 0 || b <= 0 || c <= 0 || (a + b) <= c || (a + c) <= b || (b + c) <= a) {
            triangle = "Not a triangle";
        } else if (a == b && b == c) {
            triangle = "Equilateral Triangle";
        } else if (a == b || b == c || c == a) {
            triangle = "Isosceles Triangle";
        } else if (a != b && b != c) {
            triangle = "Scalene Triangle";
        }
        return triangle;
    }
}

/*
Test case

Er det en trekant? En trekant er først en trekant når:
    a + b > c
    a + c > b
    b + c > a

Er det en ligesidet trekant? En ligesidet trekant er når:
    a == b && b == c

Er det en ligebenet trekant? En ligebenet trekant er når:
    a == b && b == c

Er det en trekant med tre forskellige sidelænger? Det er det når:
    a != b && b != c

Ingen trekant kan have værdierne 0 -> −∞
 */
