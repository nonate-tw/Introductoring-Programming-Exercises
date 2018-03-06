package DiamondExercises;

public class DiamondExercises {

    public static void main(String[] args) {
        isoscelesTriangle(3);
        diamond(5);
        diamondWithName(5);
    }

    private static void isoscelesTriangle(int lines) {
        int blankSpaces = lines;
        int extraDots = 0;


        for (int count = 1; count <= lines; ++count) {
            for (int xcount = 1; xcount < blankSpaces; ++xcount) {
                System.out.print(" ");
            }
            for (int tcount = 1; tcount <= count + extraDots; ++tcount) {
                System.out.print("*");
            }
            System.out.println("");
            blankSpaces--;
            extraDots++;
        }
    }

    private static void diamond(int lines) {
        System.out.println("Diamond");

        isoscelesTriangle(lines);

        int blankSpace = lines - 1;
        int extraDots = lines - 1;
        for (int count = lines - 1; count >= 1; --count) {
            for (int xcount = lines - 1; xcount >= blankSpace; --xcount) {
                System.out.print(" ");
            }
            for (int tcount = 1; tcount < count + extraDots; ++tcount) {
                System.out.print("*");
            }
            System.out.println("");
            blankSpace--;
            extraDots--;
        }
    }

    private static void diamondWithName(int lines) {
        int blankSpace = lines;
        int extraDots = 0;
        for (int count = 1; count <= lines - 1; ++count) {
            for (int xcount = 1; xcount < blankSpace; ++xcount) {
                System.out.print(" ");
            }
            for (int tcount = 1; tcount <= count + extraDots; ++tcount) {
                System.out.print("*");
            }
            System.out.println("");
            blankSpace--;
            extraDots++;
        }

        System.out.println(" Nicolás");

        blankSpace = lines - 1;
        extraDots = lines - 1;
        for (int count = lines - 1; count >= 1; --count) {
            for (int xcount = lines - 1; xcount >= blankSpace; --xcount) {
                System.out.print(" ");
            }
            for (int tcount = 1; tcount < count + extraDots; ++tcount) {
                System.out.print("*");
            }
            System.out.println("");
            blankSpace--;
            extraDots--;
        }
    }
}
