package practice6;

public class Application {
    public static void main(String[] args) {
//        ClassUsingThis pers1 = new ClassUsingThis("Joe", 20);
//        System.out.println(pers1.age);
//        System.out.println(pers1.name);
//        ClassWithConsructor one = new ClassWithConsructor();
//        ClassWithConsructor two = new ClassWithConsructor("John");
//
//        Human h1 = new Human();
//        System.out.println(h1.getName());
//        System.out.println(h1.getAge());
//        h1.setName("Mary");
//        h1.setAge(30);
//        System.out.println(h1.getName());
//        System.out.println(h1.getAge());
//
//        HumanWithConstructor human1 = new HumanWithConstructor();
//        HumanWithConstructor human2 = new HumanWithConstructor("Boris");
//        HumanWithConstructor human3 = new HumanWithConstructor(17);
//        HumanWithConstructor human4 = new HumanWithConstructor("Olga",56);
//        System.out.println("dsdasdasdsa");
//        System.out.println(human1.getName());
//        System.out.println(human1.getAge());
//        System.out.println(human4.getName());
//        System.out.println(human4.getAge());
//        System.out.println(human3.getAge());
//
//        h1.name = "Nick";
//        h1.setAge(5);

        bird randomBird = new bird();
        Duck randomDuck = new Duck();
        System.out.println(randomDuck.weight);
        System.out.println(randomDuck.beakLenght);
        randomBird.sleep();
        randomBird.eat();
        randomDuck.sleep();
        randomBird.eat();
        randomDuck.swim();

    }
}
