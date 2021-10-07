package practice7;

public class Starter {
    public static void main(String[] args) {
        Generator generator = new Generator();
        try{String answer = generator.helloMessage(null);
            System.out.println("Answer 1: " + answer );
        }catch (SimpleException ex){
            System.out.println("Error code: " + ex.getErrorCode());
            System.out.println("Error message: " + ex.getMessage());
        } finally {
            System.out.println("Этот блок кода выполняется в любом случае");
        }

        try
        {String answer = generator.helloMessage("Jane");
            System.out.println("Answer 2: " + answer );

        }catch (SimpleException ex){
            System.out.println("Error code: " + ex.getErrorCode());
            System.out.println("Error message: " + ex.getMessage());
        }finally {
            System.out.println("Этот блок кода выполняется в любом случае");
        }

    }
}
