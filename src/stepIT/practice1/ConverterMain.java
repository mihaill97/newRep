package stepIT.practice1;
import java.util.Scanner;
public class ConverterMain {
    public static void main(String[] args){
        //convertArrabikToR(enterInt());
        repeat(6);
    }
    static void convertArrabikToR(int num){
        switch (num) {
            case 1 -> System.out.println("I");
            case 5 -> System.out.println("V");
            case 10 -> System.out.println("X");
            case 50 -> System.out.println("L");
            case 100 -> System.out.println("C");
            case 1000 -> System.out.println("M");
            default -> System.out.println("Unexpected input");
        }

    }
    static int enterInt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter arabic numb one of following");
        int arabic = input.nextInt();
        return arabic;
    }
    static void repeat(int times){
        for (int i = times; i > 0;i--){
            System.out.println(i + " Transactions left");
            convertArrabikToR(enterInt());
        }
    }
    static void repeat(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter arabic numb one of following");
        int arabic = input1.nextInt();
        convertArrabikToR(arabic);
        System.out.println("Do you want to continue?");
        Scanner input2 = new Scanner(System.in);
        String answer = input2.nextLine();
        if(answer.equals("Yes")){
            repeat();
      }
        else if(answer.equals("No")) {
           return;
        } else System.out.println("Incorrect input, please enter yes or no");

        }
    }



