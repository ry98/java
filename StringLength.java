import java.util.*;
public class StringLength {


    public static void main(String[] args) {
        int numChars=1;
        ArrayList<String> test=new ArrayList<String>();
        try {
            while(true)
            {
                test.add(getRandom());
                numChars+=10;
            }
        } catch (OutOfMemoryError E) {
            System.out.println(numChars);
        }

    }
    private static String getRandom() {
        String possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder randString = new StringBuilder();
        Random rnd = new Random();
        while (randString.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * possible.length());
            randString.append(possible.charAt(index));
        }
        return randString.toString();

    }
}