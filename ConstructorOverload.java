public class ConstructorOverload {
    public static void main(String[] args) throws Exception{
            myClass x= new myClass(5,4,3,2);
            
         }
}
class myClass{
    public myClass(int x){
        System.out.println(x);
    }
    public myClass(int x,int y){
        this(x);
        System.out.println(x*y);
    }
    public myClass(int x,int y, int z){
        this(x,y);
        System.out.println(x*y*z);
    }
    public myClass(int x,int y, int z, int a){
        this(x,y,z);
        System.out.println(x*y*z*a);
    }
} 