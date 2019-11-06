import java.util.List;

public class Calculator {

    private Description description;
    private List<List<Double>> input;

    public Calculator(Description description, List<List<Double>> input) {
        this.description = description;
        this.input = input;
    }

    public void calculateOutput() {
        for (List<Double> numbers : input) {
            double result = 0;
            for (int i = 0; i < description.getVariables().size(); i++) {
                double resultTemp = 1;
                for (int j = 0; j < description.getK(); j++) {
                    if (description.getVariables().get(i).get(j) != 0) {
                        resultTemp *= numbers.get(description.getVariables().get(i).get(j) - 1);
                    }
                }
                resultTemp *= description.getWeights().get(i);
                result += resultTemp;
            }
            System.out.println(result);
        }
    }
}
