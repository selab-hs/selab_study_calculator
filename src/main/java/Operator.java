import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Operator {

  private final List<String> Operator = new ArrayList<>();

  Operator(List<String> inputs) {
    Stream<String> operatorStream = inputs.stream();
    operatorStream.filter(input -> input.matches("[\\+\\-\\*\\/]"))
        .forEach(this::setOperator);
  }

  public String getOperator(int index) {
    return Operator.get(index);
  }

  public void setOperator(String input) {
    Operator.add(input);
  }

  public int getSize() {
    return Operator.size();
  }

}
