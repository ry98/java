
public class StringLength {


    public static void main(String[] args) {
        int numChars=1;
        String test="l";
        try {
            while(true)
            {
                test+="llllllllllllllllllllllllllllllllllllll";
                numChars+=40;
            }
        } catch (OutOfMemoryError E) {
            System.out.println(numChars);
        }

    }
}