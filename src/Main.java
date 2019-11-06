import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Description description = DescriptionReader.fetchDescription(args[1]);
        List<List<Double>> input = InputReader.fetchInput();
        if (Objects.nonNull(description)) {
            Calculator calculator = new Calculator(description, input);
            calculator.calculateOutput();
        }
    }
}
