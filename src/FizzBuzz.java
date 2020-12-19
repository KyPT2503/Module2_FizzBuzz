public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String KHONG = "khong";
    private static final String MOT = "mot";
    private static final String HAI = "hai";
    private static final String BON = "bon";
    private static final String SAU = "sau";
    private static final String BAY = "bay";
    private static final String TAM = "tam";
    private static final String CHIN = "chin";

    public static String fizzBuzz(int number) {
        if (number < 10) {
            String x = fizzBuzzLessThan10(number);
            if (x != null) return x;
        } else {
            return fizzBuzzLessThan10(number/10)+fizzBuzzLessThan10(number%10);
        }
        return "";
    }

    private static String fizzBuzzLessThan10(int number) {
        if (number == 0) return KHONG;
        if (number == 1) return MOT;
        if (number == 2) return HAI;
        if (number == 3) return FIZZ;
        if (number == 4) return BON;
        if (number == 5) return BUZZ;
        if (number == 6) return SAU;
        if (number == 7) return BAY;
        if (number == 8) return TAM;
        if (number == 9) return CHIN;
        return null;
    }
}
