package TriangleExercises;

public class TriangleExercises {

    public static void main(String[] args) {

        drawARightTriangle(5);
    }

    // Easiest exercise ever
    public static void easiestExerciseEver() {
        System.out.println("Easiest Exercise Ever");
        System.out.println("*");
    }

    // Draw a horizontal line
    public static void drawAHorizontalLine( int n ) {
        System.out.println("Draw A Horizontal Line");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    // Draw a vertical line
    public static void drawAVerticalLine( int n ) {
        System.out.println("Draw A Vertical Line");
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    // Draw a right triangle
    public static void drawARightTriangle( int n ) {
        System.out.println("Draw A Right Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
