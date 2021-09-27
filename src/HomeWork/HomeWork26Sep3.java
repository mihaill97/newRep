package HomeWork;
import java.util.Scanner;
public class HomeWork26Sep3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sex;
        System.out.println("Выбери свой пол - нажми '1' для женщин и '2' для мужчин: ");
        sex = input.nextLine();
        int age;
        System.out.print("Введи свой возраст: ");
        age = input.nextInt();

        int i = (65 - age);
        int i1 = (70 - age);
        int i2 = (age - 65);
        int i3 = (age - 70);

        if (sex.equals("1") && i > 0) {
            System.out.println("Лет до пенсии: " + i);
        } else if (sex.equals("2") && i1 > 0) {
            System.out.println("Лет до пенсии: " + i1);
        } else if (sex.equals("1") && i < 0) {
            System.out.println("Лет на пенсии: " + i2);
        } else if (sex.equals("2") && i < 0) {
            System.out.println("Лет на пенсии: " + i3);

        }
    }
}
