package HomeWork;

import java.util.Scanner;

public class HomeWork26Sep2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int grade;

        System.out.println("Введите свою оценку за экзамен: ");
        grade = scanner.nextInt();
        if (grade >= 90){
            System.out.println("Ваша оценка - А");

        }
        if (grade >=80 && grade <90){
            System.out.println("Ваша оценка - В");

        }
        if(grade >70 && grade <80){
            System.out.println("Ваша оценка - С");

        }
        if (grade >=60 && grade < 70){
            System.out.println("Ваша оценка - D");

        }
        if (grade < 60){
            System.out.println("Ваша оценка - F");

        }
    }
}
