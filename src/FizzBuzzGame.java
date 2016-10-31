import java.util.LinkedHashMap;
import java.util.Map;

public class FizzBuzzGame {

    private static Map<Integer, String> specialNumbers =  new LinkedHashMap<>();

    static {
        specialNumbers.put(15,"FizzBuzz");
        specialNumbers.put(3,"Fizz");
        specialNumbers.put(5,"Buzz");
    }

    public static String FizzBuzz(int number) {
        for (Map.Entry<Integer, String> knownSpecial : specialNumbers.entrySet()) {
            if (number % knownSpecial.getKey() == 0) {
                return knownSpecial.getValue();
            }

        } return String.valueOf(number);
    }
}
