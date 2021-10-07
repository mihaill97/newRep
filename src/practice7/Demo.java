package practice7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog("jack");
        dog.putCollar();
        dog.putLeash();
       // dog.walk();

        try {
            dog.walk();
        }catch (DogIsNotReadyException e){
            System.out.println(e.getMessage());
            System.out.println("CHecking equipment...\n" +
                    "ошейник" +dog.isCollarPutOn +
                    "\nповодок" +dog.isLeashPutOn +
                    "\nнамордник"+dog.isMuzzlePutOn);
        }

    }
}
