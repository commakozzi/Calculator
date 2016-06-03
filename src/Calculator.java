public class Calculator {

    public void calculate (String[] expression) {

        // Member variables:
        double result = 0;
        String firstNumber = expression[0];
        String operator = expression[1];
        String secondNumber = expression[2];

        // Determine type of calculation and perform:
        switch (operator) {
            case "+":
                result = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
                break;
            case "-":
                result = Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
                break;
            case "/":
                result = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
                break;
            case "*":
                result = Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
                break;
        }

        // Display results:
        System.out.println(result);

    } // End calculate()

}
