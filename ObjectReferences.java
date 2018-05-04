//final cannot be changed, when passed by value the original will not change, when passed by reference the actual value will change

public class ObjectReferences {
    public static int myint=2;
    public static void main(String[] args) throws Exception{
        System.out.println("Passing by value!");
        int y=2;
        final int z=2;
        System.out.println("initial values are:"+Integer.toString(y)+", "+Integer.toString(myint)+", "+ Integer.toString(z));
        System.out.println("Tripling");
        ObjectReferences or=new ObjectReferences();
        triple(y,or,z);
        System.out.println("Now the value is: "+Integer.toString(y)+", "+Integer.toString(myint)+", "+ Integer.toString(z));
         }
    public static void triple(int x, ObjectReferences y, int z)
    {
        x=x*3;
        y.myint=y.myint*3;
        z=z*3;

    }
}