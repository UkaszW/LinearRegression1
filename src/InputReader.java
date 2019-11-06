import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputReader {

    public static List<List<Double>> fetchInput() {
        List<List<Double>> input = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            input.add(Arrays.stream(line.split("\\s+")).map(Double::parseDouble).collect(Collectors.toList()));
        }
        return input;
    }
}
