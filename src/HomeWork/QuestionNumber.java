package HomeWork;
import java.util.Scanner;
    public class QuestionNumber {
        public static void main (String [] args) {
            Scanner input = new Scanner(System.in);
            // создается рандомное число
            int randomNumber = (int)(Math.random() * 10);
            System.out.print("Напиши число от 1 до 10 : ");
            // вариант пользователя
            int numb = input.nextInt();

            while (numb != randomNumber) {
                // подсказка пользователю выше или ниже
                if (numb > randomNumber) {
                    System.out.println("Твое число больше");
                } else {
                    System.out.println("Твое число меньше");
                }

                System.out.print("Введи другое число ");
                numb = input.nextInt();
            }

            System.out.println("Поздравляю ты отгадал!!!");
        }
    }

