import java.util.List;

public class Main {
    public static void main(String[] args) {

        Input input = new Input();

        String[] str = input.inputDataSplit(input.input());
        input.split(str);

        List<String> operators = input.getOperators();
        List<Integer> numbers = input.getNumbers();

        int result = Calculator.calculate(numbers, operators);

        Output output = new Output();
        output.output(result);

    }
}