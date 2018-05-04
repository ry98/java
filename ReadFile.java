

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ReadFile {

static String FILEIN="test.txt";
    static String FILEOUT="out.txt";


    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new FileReader(FILEIN));
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILEOUT));
            String next;
            while ((next = br.readLine()) != null)
            {
             writer.write(next);
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