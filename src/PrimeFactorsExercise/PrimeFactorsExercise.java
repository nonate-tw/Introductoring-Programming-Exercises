package PrimeFactorsExercise;

public class PrimeFactorsExercise {

    public static void main(String[] args) {
        generate(30);
    }

    // Prime Factors
    public static void generate(int n) {
        String out = "";

        for (int i = 2; i <= n; i++) {

            while (n % i == 0){
                out += i + ",";
                n /= i;
            }
        }

        System.out.println(out.substring(0, out.length()-1));
    }
}
