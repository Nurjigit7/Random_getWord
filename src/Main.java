import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        getWord("null");
    }

    public static void getWord(String input) {
        Random random = new Random();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] split = input.split(" ");
        String[] array = new String[split.length];

        long count = 0;
        boolean table = true;
        while (table) {
            for (int i = 0; i < split.length; i++) {
                String san = alphabet[random.nextInt(alphabet.length)];
                array[i] = san;
                count++;
                if (Arrays.equals(split, array)) {
                    System.out.println("end !!");
                    System.out.println(Arrays.toString(array));
                    System.out.println("Количества попыток :" + count);
                    table = false;
                    break;
                }else {
                    System.out.println(Arrays.toString(Arrays.stream(array).toArray()));
                }
            }
        }
    }
}

