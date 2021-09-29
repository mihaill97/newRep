package practice6;

public class HumanWithConstructor {
    private String name;
    private int age;
    public HumanWithConstructor(){
        this.name = "Bob";
        this.age = 18;
    }public HumanWithConstructor(String name){
        this.name = name;
        this.age = 18;
    }
    public HumanWithConstructor(int age){
        this.name = "Bob";
        this.age = age;
    }
    public HumanWithConstructor(String name ,int age){
        this.name = "Bob";
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0|| age > 150){
            this.age = 0;
        }else{
            this.age = age;
        }

}
}