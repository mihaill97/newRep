package HomeWork;

public class RemoveArray {
    public static void main(String[] args) {
        int[] numArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < numArray.length; i++) {
            double a = numArray[i] * 0.25;
            double b = numArray[i] - a;
            System.out.println(b);
        }
    }
}
