package kovteba.algorithm.dijkstra;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Dijkstra {

    public static void main(String[] args) {

        double res = dijkstra(args);
        System.out.println("RESULT: " + res);

    }

    public static double dijkstra(String[] s) {

        Queue<String> inputString = new LinkedList<>(Arrays.asList(s));

        Stack<String> operations = new Stack<>();
        Stack<Double> values = new Stack<>();

        while (!inputString.isEmpty()) {
            String token = inputString.poll();
            switch (token) {
                case "(":
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    operations.push(token);
                    break;
                case ")":
                    values.push(applyOperation(operations, values));
                    break;
                default:
                    values.push(Double.parseDouble(token));
                    break;
            }
        }

        return applyOperation(operations, values);
    }

    private static Double applyOperation(Stack<String> operations, Stack<Double> values) {

        double val = values.pop();

        if (!operations.empty()) {
            String op = operations.pop();
            switch (op) {
                case "+":
                    val = values.pop() + val;
                    break;
                case "-":
                    val = values.pop() - val;
                    break;
                case "*":
                    val = values.pop() * val;
                    break;
                case "/":
                    val = values.pop() / val;
                    break;
                default:
                    break;
            }
        }

        return val;
    }
}
