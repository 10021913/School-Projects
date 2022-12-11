import java.util.ArrayList;

public class EquationSolver {
    public static void main(String[] args) {
        // Test Cases;
        String equation = "2+2";

        // Formatting
        equation = equation.replace("÷", "/");
        equation = equation.replace("×", "*");
        // Checking For Syntax Errors
        Boolean syntaxError = false;

        // Negative Errorr
        String[] lameError = equation.split("−");
        for (int x = 0; x < lameError.length; x++) {
            if (!lameError[x].endsWith("*") && !lameError[x].endsWith("/") && !lameError[x].endsWith("+")
                    && !lameError[x].endsWith("-")) {
                syntaxError = true;
                break;
            }

        }
        if (equation.indexOf("..") != -1) // Decimal Errors
            syntaxError = true;
        String[] Operands = {
                "+",
                "-",
                "*",
                "/"
        };
        for (int x = 0; x < Operands.length; x++) { // Combinations of operators that cause Erorrs
            for (int y = 0; y < Operands.length; y++) {
                if (equation.indexOf(Operands[x] + Operands[y]) != -1) {
                    syntaxError = true;
                }
            }
            if (equation.endsWith(Operands[x]) || equation.startsWith(Operands[x])) {
                syntaxError = true;
            }
        }

        // Ouput
        if (!syntaxError) {
            try {
                System.out.println(solve(equation, 1));
            } catch (Exception e) {
                System.out.println(e);
            }

        } else {
            System.out.println("NO!");
        }

    }

    // Math operators
    public static Double add(Double number1, Double number2) {
        return number1 + number2;
    }

    public static Double minus(Double number1, Double number2) {
        return number1 - number2;
    }

    public static Double divide(Double number1, double number2) {
        return number1 / number2;
    }

    public static Double multiply(Double number1, double number2) {
        return number1 * number2;
    }

    public static Double exponent(Double base, Double exponent) {
        return Math.pow(base, exponent);
    }

    public static Double solve(String equation, int nthTime) {

        // Variables
        final DecimalFormat df = new DecimalFormat("0.0000000000");
        ArrayList<String> operands = new ArrayList<>();
        String[] Polynomials;

        // Addition/Subtraction
        if (nthTime == 1) {
            Polynomials = equation.split("[+\\-]");
            // Storing Operands
            for (int x = 0; x < equation.length(); x++) {
                if (equation.charAt(x) == '+' || equation.charAt(x) == '-') {
                    operands.add((Character.toString(equation.charAt(x))));
                }
            }
        } else if (nthTime == 2) {
            Polynomials = equation.split("[*/]");
            // Storing Operands
            for (int x = 0; x < Polynomials.length; x++) {

                // Storing Operands
                if (Polynomials[x].contains("^"))
                    Polynomials[x] = String.valueOf(solve(Polynomials[x], nthTime + 1));

            }
            // Storing Operands
            for (int x = 0; x < equation.length(); x++) {
                if (equation.charAt(x) == '*' || equation.charAt(x) == '/') {

                    operands.add((Character.toString(equation.charAt(x))));
                }
            }
        } else {
            Polynomials = equation.split("\\^");
            // Storing Operands
            for (int x = 0; x < equation.length(); x++) {
                if (equation.charAt(x) == '^') {
                    operands.add((Character.toString(equation.charAt(x))));
                }
            }
        }
        // Division/Multiplication

        // Solving Multiplication/Division
        for (int x = 0; x < Polynomials.length; x++) {

            // Storing Operands
            if (Polynomials[x].contains("*") || Polynomials[x].contains("/"))
                Polynomials[x] = String.valueOf(solve(Polynomials[x], nthTime + 1));

        }

        // Solving Addition and Subtraction
        if (nthTime == 1) {
            // Replace weird negative sign with normal negative sign
            for (int x = 0; x < Polynomials.length; x++) {
                Polynomials[x] = Polynomials[x].replace("−", "-");
            }
            for (int x = 0; x < operands.size(); x++) {
                if (operands.get(x).equals("+"))
                    Polynomials[x + 1] = String.valueOf(add(Double.parseDouble(Polynomials[x]),
                            Double.parseDouble(Polynomials[x + 1])));

                if (operands.get(x).equals("-")) {
                    Polynomials[x + 1] = String.valueOf(minus(Double.parseDouble(Polynomials[x]),
                            Double.parseDouble(Polynomials[x + 1])));
                }
            }
        }

        // Solving Division and Multiplication
        else if (nthTime == 2) {
            // Replace weird negative sign with normal negative sign
            for (int x = 0; x < Polynomials.length; x++) {
                Polynomials[x] = Polynomials[x].replace("−", "-");
            }
            for (int x = 0; x < operands.size(); x++) {
                if (operands.get(x).equals("*")) {
                    Polynomials[x + 1] = String.valueOf(multiply(Double.parseDouble(Polynomials[x]),
                            Double.parseDouble(Polynomials[x + 1])));
                }
                if (operands.get(x).equals("/")) {
                    Polynomials[x + 1] = String.valueOf(divide(Double.parseDouble(Polynomials[x]),
                            Double.parseDouble(Polynomials[x + 1])));
                }
            }
        } else {
            // Replace weird negative sign with normal negative sign
            for (int x = 0; x < Polynomials.length; x++) {
                Polynomials[x] = Polynomials[x].replace("−", "-");
            }
            for (int x = 0; x < operands.size(); x++) {
                if (operands.get(x).equals("^")) {
                    Polynomials[x + 1] = String.valueOf(exponent(Double.parseDouble(Polynomials[x]),
                            Double.parseDouble(Polynomials[x + 1])));
                }
            }
        }
        int x;
        if (Double.parseDouble(Polynomials[Polynomials.length - 1]) == 1 / 0.0)
            x = 0 / 0; // Creating an error so the try/catch makes the output "ERROR!"
        return Double.parseDouble(Polynomials[Polynomials.length - 1]); // 0Output
    }
}