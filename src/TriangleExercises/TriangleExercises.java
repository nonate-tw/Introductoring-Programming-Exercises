package TriangleExercises;

public class TriangleExercises {

    public static void main(String[] args) {

        drawAHorizontalLine(5);
    }

    // Easiest exercise ever
    public static void easiestExerciseEver() {
        System.out.println("Easiest Exercise Ever");
        System.out.println("*");
    }

    // Draw a horizontal line
    public static void drawAHorizontalLine( int n ){
        System.out.println("Draw A Horizontal Line");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

}
