import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public final class ReadDeleteEvenAndPrint {
    public static void main(String[] args) {

        List<Integer> to_print = getInputAsInt(); // CTRL + D TO END INPUT
        Collections.reverse(to_print);
        String formattedString = to_print.toString()
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();
        System.out.println(formattedString);
    }
    private static List<Integer> getInputAsInt() {
        List<Integer> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int next;
        while(scan.hasNext()) {
            next = scan.nextInt();
            if (0 != count % 2) {
                array.add(next);
            }
            count++;
        }

        return array;

    }
}
