import java.util.Arrays;

public class StringSplitter {

    public static void main(String[] args) {

        String[] printMe = stringToArray("apple same to do");
        System.out.println(Arrays.toString(printMe));
    }

    public static String[] stringToArray(String s) {
        //your code;
        // Take string and split by space.
        String[] wordsArray = s.split(" ");
        return wordsArray;

    }
}
