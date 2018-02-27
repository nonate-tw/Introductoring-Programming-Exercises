package DiamondExercises;

public class DiamondExercises {

    public static void main(String[] args) {
        isoscelesTriangle(3);
    }

    // Isosceles Triangle
    public static void isoscelesTriangle(int n) {
        System.out.println("Isosceles Triangle");
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
}
