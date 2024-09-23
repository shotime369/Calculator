public class Calculator {

        private final double num1;
        private final double num2;
        private final String operator;

        //constructor
    public Calculator(double num1, double num2, String operator) {
            this.num1 = num1;
            this.num2 = num2;
            this.operator = operator;
        }

        public double operate(){
            if (this.operator.equals("-")) {
                return num1 - num2;
            } else if (this.operator.equals("+")) {
                return num1 + num2;
            } else if (this.operator.equals("x")) {
                return num1 * num2;
            } else if (this.operator.equals("/")) {
                return num1 / num2;
            } else if (this.operator.equals("%")) {
                return num1 % num2;
            } else { //if unknown return sum
                return num1 + num2;
            }
        }

    }




  //  return switch (this.operator) {
  //      case "-" -> num1 - num2;
   //             case "+" -> num1 + num2;
  //              case "x" -> num1 * num2;
  //              case "/" -> num1 / num2;
  //              case "%" -> num1 % num2;
//default ->  //if unknown return sum
//num1 + num2;

