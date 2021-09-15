package HomeWork;
import java.util.Scanner;
public class GreatingsLang {
    public static void main(String [] args){

        int lang;

        Scanner input = new Scanner(System.in);
        System.out.println("Choose your language: 1 - english; 2 - russian ; 3 - romanian");
        lang = input.nextInt();

        if (lang == 1)
            System.out.println("Hello my friend");
        if (lang == 2)
            System.out.println("Здравствуй друг");
        if(lang == 3)
            System.out.println("Salut prietene!!");

    }
}
