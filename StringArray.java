import java.util.Arrays;
import java.util.List;

public class StringArray {
    public static void main(String[] args) {
        String[] input = {"a", "a", "a", "a", "b", "b", "b", "a", "b", "c", "d", "e", "d",
                "d", "d", "z", "y", "s"};
        printCharOccurrences(input);
    }

    public static void printCharOccurrences(String[] input) {
        List<String> sortedList = Arrays.asList(input);
        sortedList.sort(String::compareTo);

        char currentChar = sortedList.get(0).charAt(0);
        int count = 0;

        for (String str : sortedList) {
            char charInArray = str.charAt(0);

            if (charInArray == currentChar) {
                count++;
            } else {
                System.out.println(currentChar + " - " + count);
                currentChar = charInArray;
                count = 1;
            }
        }
        System.out.println(currentChar + " - " + count);
    }
}
