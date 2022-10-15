import java.lang.management.ManagementPermission;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


    //посчитать какая буква встречается чаще всего
    public static void main(String[] args) {

        Map<Character, Integer> time = new HashMap<>();
        for (int i = 0; i < TEXT.length(); i++) {
            char symbol = TEXT.charAt(i);
            if (Character.isLetter(symbol)) {
                if (time.containsKey(symbol)) {
                    time.put(symbol, time.get(symbol) + 1);
                } else {
                    time.put(symbol, 1);
                }
            }


            int timeMax = -1;
            char charMax = 0;
            for (char s : time.keySet()) {
                int t = time.get(s);
                if (t > timeMax) {
                    timeMax = t;
                    charMax = s;
                }
            }

            System.out.println("Максимальная частота у символа " + charMax + ": " + timeMax);

            int min = Integer.MAX_VALUE;
            for (int s : time.keySet()) {
                if (s < min) {
                    min = s;
                }
            }
        }


        WordsChecker checker = new WordsChecker(TEXT);

        System.out.println(checker.hasWord(" "));
    }

}


