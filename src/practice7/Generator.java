package practice7;

public class Generator {
    public  String helloMessage (String name ) throws SimpleException {
        if (name == null){
            SimpleException se = new SimpleException(10,"Message is null");
            throw  se;
        }
        return "hello" + name;
    }
}


