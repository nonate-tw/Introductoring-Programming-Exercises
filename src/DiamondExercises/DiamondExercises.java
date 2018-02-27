package DiamondExercises;

public class DiamondExercises {

    public static void main(String[] args) {
        diamond(3);
    }

    // Isosceles Triangle
    public static void isoscelesTriangle(int n) {
        int b = n;
        int extra = 0;
        for(int count = 1; count <= n; ++count){
            for(int xcount = 1; xcount < b; ++xcount){
                System.out.print(" ");
            }
            for(int tcount =1; tcount <= count + extra; ++tcount){
                System.out.print("*");
            }
            System.out.println("");
            b--;
            extra++;
        }
    }

    // Diamond
    public static void diamond(int n) {
        System.out.println("Diamond");

        isoscelesTriangle(n);

        int b = n-1;
        int extra = n-1;
        for(int count = n-1; count >= 1; --count){
            for(int xcount = 1; xcount < b; ++xcount){
                System.out.print(" ");
            }
            for(int tcount = 1; tcount < count+extra; ++tcount){
                System.out.print("*");
            }
            System.out.println("");
            b++;
            extra--;
        }
    }
}
