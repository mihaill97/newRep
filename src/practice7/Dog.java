package practice7;

public class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar(){
        System.out.println("Ошейник надет ");
        this.isCollarPutOn = true;
    }
    public void putLeash(){
        System.out.println("Поводок надет");
        this.isLeashPutOn = true;
    }
    public void putMuzzle(){
        System.out.println("Намордник надет");
        this.isMuzzlePutOn = true;
    }
    public void walk () throws DogIsNotReadyException {
        System.out.println("Go walk ");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn){
            System.out.println("Go" + name + "Very happy" );
        }else {
            throw new DogIsNotReadyException ("Dog"+ name + "not ready to walk. Chek equipment");
        }
    }
}
