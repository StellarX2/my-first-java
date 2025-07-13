import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите операцию (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверная операция.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}