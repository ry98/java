import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;



class ExceptionsPractice {
   public static void main(String args[]) {
       try{
            BufferedReader br=new BufferedReader(new FileReader("nope.txt"));
       }
       catch(FileNotFoundException e){
           System.out.println("Caught checked exception!");
        }
        try{
            int x = 0;
            int y = 10;
            int z = y/x;
       }
       catch(ArithmeticException e){
           System.out.println("Caught unchecked exception!");
        }
        try{
            double[][] error=new double[(int)Math.pow(20,1000000)][(int)Math.pow(20,1000000)];
       }
       catch(OutOfMemoryError E){
           System.out.println("Caught Error!");
        }
     
  }
}