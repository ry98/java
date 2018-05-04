
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ReadReverse {

static String FILEIN="test.txt";
    static String FILEOUT="out.txt";


    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new FileReader(FILEIN));
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILEOUT));
            String[] strings=new String[10000];
            for(int i=0;i<10000;i++)
            {
             strings[i]=br.readLine();
            }
            for(int i=9999;i>=0;i--)
            {
             writer.write(strings[i]);
             writer.newLine();
            }
            br.close();
            writer.close();
        }
        catch(Exception ex)
        {
            System.out.println("UNABLE TO READ FILE");
        }
        
        

    }
}