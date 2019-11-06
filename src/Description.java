import java.util.List;

public class Description {

    private int n;
    private int k;
    private List<List<Integer>> variables;
    private List<Double> weights;

    public Description(int n, int k, List<List<Integer>> variables, List<Double> weights) {
        this.n = n;
        this.k = k;
        this.variables = variables;
        this.weights = weights;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public List<List<Integer>> getVariables() {
        return variables;
    }

    public void setVariables(List<List<Integer>> variables) {
        this.variables = variables;
    }

    public List<Double> getWeights() {
        return weights;
    }

    public void setWeights(List<Double> weights) {
        this.weights = weights;
    }
}
