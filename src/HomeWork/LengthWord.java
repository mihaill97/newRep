package HomeWork;
import java.util.Arrays;
import java.util.Comparator;
public class LengthWord {

    static String max(String par)
    {
        String[]words=par.split(" ");
        String resstring="";
        for(String word: words)
        {
            if(word.length()>resstring.length())
                resstring=word;
        }
        return(resstring);
    }

    static public void main(String args[])
    {
        String somestring="one two three four fiveee";
        String maxword = max(somestring);
        System.out.println(maxword);
        System.out.println(maxword.length());
    }

}
