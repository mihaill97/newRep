package HomeWork;

import java.util.Scanner;

public class HomeWork26Sep1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Введите 2 числа");
        x = input.nextInt();
        y = input.nextInt();
        if (x > y){
            System.out.println("x > y");
        }
        if (x < y){
            System.out.println("x < y");
        }
        else{
            System.out.println("x = y");
        }
    }
}
