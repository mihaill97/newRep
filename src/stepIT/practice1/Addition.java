package stepIT.practice1;
import java.util.Scanner;
public class Addition {
    //main method begins execution of Java app
    public static void main(String[] args){
        //create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1;//first number to add
        int number2;//second number to add
        int sum;//sum of number1 and number2

        System.out.print("Enter first integer: ");//promt
        number1 = input.nextInt();//read first number from user

        System.out.print("Enter second integer: ");//promt
        number2 = input.nextInt();
        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);//display sum

    }//end method main
}//end class Addition
