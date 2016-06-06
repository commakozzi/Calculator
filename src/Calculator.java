import com.fathzer.soft.javaluator.DoubleEvaluator;

public class Calculator {

//  public void calculate (String[] expression) {
    public void calculate (String expression) {

        // Load utilities:
        DoubleEvaluator evaluator = new DoubleEvaluator();

        double result = evaluator.evaluate(expression);

        // Display results:
        System.out.println(result);

    } // End calculate()

}
