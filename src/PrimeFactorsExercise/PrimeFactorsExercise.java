package PrimeFactorsExercise;

public class PrimeFactorsExercise {

    public static void main(String[] args) {
        primeFactors(30);
    }

    private static void primeFactors(int number) {
        String out = "";

        for (int i = 2; i <= number; i++) {

            while (number % i == 0){
                out += i + ",";
                number /= i;
            }
        }

        System.out.println(out.substring(0, out.length()-1));
    }
}
