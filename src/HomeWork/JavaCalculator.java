package HomeWork;
import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double answ;//ответ
        char operate;//оператор
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        operate = scanner.next().charAt(0);
        switch (operate) {
            case '+' -> answ = num1 + num2;
            case '-' -> answ = num1 - num2;
            case '*' -> answ = num1 * num2;
            case '/' -> answ = num1 / num2;
            default -> {
                System.out.print("Неверный оператор! Введите другой оператор");
                return;
            }
        }
        System.out.print("В результате вычисления получаем :");
        System.out.print(""+answ);

    }
}
