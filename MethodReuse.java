import java.io.File;

import java.io.BufferedWriter;
import java.io.FileWriter;
public class MethodReuse {
        public static void main(String[] args) throws Exception{
            xmlComposition xcomp=new xmlComposition();
            xcomp.write("hi!");
            lineComposition lcomp=new lineComposition();
            lcomp.write("hi!");
            xmlInheritance xin=new xmlInheritance();
            xin.write("hi!");
            lineInheritance lin=new lineInheritance();
            lin.write("hi!");
            xmlStatic xstat=new xmlStatic();
            xstat.write("hi!");
            lineStatic lstat=new lineStatic();
            lstat.write("hi!");

             }
    }
//Composition- can use desired parts of the class used

class outputComposition{
    public BufferedWriter openfile(String fileName) throws Exception
    {
        return new BufferedWriter(new FileWriter(fileName));
    }

}
class xmlComposition{
    private outputComposition oc;
    public xmlComposition()
    {
        oc=new outputComposition();
    }
    public void write(String s) throws Exception
    {
        BufferedWriter bw=oc.openfile("xml.txt");
        bw.write("<string>"+s+"</string>");
        bw.close();
    }

}
class lineComposition{
    private outputComposition oc;
    public lineComposition()
    {
        oc=new outputComposition();
    }
    public void write(String s) throws Exception
    {
        BufferedWriter bw=oc.openfile("line.txt");
        bw.write(s);
        bw.close();
    }

}

//inheritance- takes all parts of a parent class
class xmlInheritance extends outputComposition{
    public void write(String s) throws Exception
    {
        BufferedWriter bw=openfile("xml.txt");
        bw.write("<string>"+s+"</string>");
        bw.close();
    }

}
class lineInheritance extends outputComposition{
    public void write(String s) throws Exception
    {
        BufferedWriter bw=openfile("line.txt");
        bw.write(s);
        bw.close();
    }

}

//static method calls- should only be used when not affecting states
class output{
    public static BufferedWriter openfile(String fileName) throws Exception
    {
        return new BufferedWriter(new FileWriter(fileName));
    }

}
class xmlStatic{
    public void write(String s) throws Exception
    {
        BufferedWriter bw=output.openfile("xml.txt");
        bw.write("<string>"+s+"</string>");
        bw.close();
    }

}
class lineStatic{
    public void write(String s) throws Exception
    {
        BufferedWriter bw=output.openfile("line.txt");
        bw.write(s);
        bw.close();
    }

}

