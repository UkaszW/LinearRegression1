import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DescriptionReader {

    public static Description fetchDescription(String filePath) {
        List<Integer> lineVariables = new ArrayList<>();
        List<List<Integer>> variables = new ArrayList<>();
        List<Double> weights = new ArrayList<>();

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            int n = Integer.parseInt(scanner.next());
            int k = Integer.parseInt(scanner.next());

            int iterator = k;
            while (scanner.hasNext()) {
                if (iterator > 0) {
                    lineVariables.add(Integer.parseInt(scanner.next()));
                } else {
                    variables.add(new ArrayList<>(lineVariables));
                    lineVariables.clear();
                    weights.add(Double.parseDouble(scanner.next()));
                    iterator = k + 1;
                }
                iterator--;
            }
            return new Description(n, k, variables, weights);
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred: " + e);
        }
        return null;
    }
}
