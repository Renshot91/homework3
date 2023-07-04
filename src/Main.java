public class Main {
//     1. Создайте методы с математическими операциями +, -, *, /
//    2.Каждый метод принимает два числа в параметрах и возвращает результат
//    3.Вызовите все методы в main
//    4.Результат распечатайте в консоль

    public static void main(String[] args) {
    }
    public class MathOperations {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static double divide(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
        }

        public static void main(String[] args) {
            int a = 10;
            int b = 5;

            int additionResult = add(a, b);
            int subtractionResult = subtract(a, b);
            int multiplicationResult = multiply(a, b);
            double divisionResult = divide(a, b);

            System.out.println("Addition: " + additionResult);
            System.out.println("Subtraction: " + subtractionResult);
            System.out.println("Multiplication: " + multiplicationResult);
            System.out.println("Division: " + divisionResult);
        }
    }

}