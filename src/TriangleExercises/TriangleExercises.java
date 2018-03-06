package TriangleExercises;

public class TriangleExercises {

    public static void main(String[] args) {

        easiestExerciseEver();
        drawAHorizontalLine(3);
        drawAVerticalLine(3);
        drawARightTriangle(5);
    }

    private static void easiestExerciseEver() {
        System.out.println("Easiest Exercise Ever");
        System.out.println("*");
    }

    private static void drawAHorizontalLine( int n ) {
        System.out.println("Draw A Horizontal Line");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    private static void drawAVerticalLine( int n ) {
        System.out.println("\nDraw A Vertical Line");
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    private static void drawARightTriangle( int n ) {
        System.out.println("Draw A Right Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
