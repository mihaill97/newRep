package HomeWork;

public class ReversHomeWork {
    public static void main(String[] args) {
        String str = "Это предложение будет в обратном порядке !";
        char[] reverseArray = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        System.out.print("Массив в обратном порядке: ");
        for (int i = reverseArray.length-1; i >= 0; i--) System.out.print(reverseArray[i]);
    }
}