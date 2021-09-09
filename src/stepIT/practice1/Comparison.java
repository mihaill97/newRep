package stepIT.practice1;
import java.util.Scanner;
public class Comparison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1;//first number to add
        int number2;//second number to add
        int sum;//sum of number1 and number2

        System.out.print("Enter first integer: ");//promt
        number1 = input.nextInt();//read first number from user

        System.out.print("Enter second integer: ");//promt
        number2 = input.nextInt();
        if(number1 == number2)
            System.out.printf("%d == %d%n", number1, number2 );
        if(number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        if(number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);
        if(number1 > number2)
            System.out.printf("%d > %d%n",number1,number2);
        if (number1 <= number2)
            System.out.printf("%d <=%d%n",number1,number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d%n",number1,number2);


    }
}
