import java.util.Stack;

public class ArithmeticExpressionEvaluator {
    int evaluatePreOrderExpression(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(val1 + val2);
                        break;

                    case "-":
                        stack.push(val1 - val2);
                        break;

                    case "/":
                        stack.push(val1 / val2);
                        break;

                    case "*":
                        stack.push(val1 * val2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    // Método para avaliar uma expressão pós-fixada
    int evaluatePosOrderExpression(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(val2 + val1);
                        break;

                    case "-":
                        stack.push(val2 - val1);
                        break;

                    case "/":
                        stack.push(val2 / val1);
                        break;

                    case "*":
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
    boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
    

