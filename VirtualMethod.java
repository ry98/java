public class VirtualMethod {
    public static void main(String[] args) throws Exception{
            number one=new one();
            one.triple();
         }
}
public class number{
    public int triple(){
        System.out.println("Can't triple");
        return 0;
    }
}
public class one extends number{
    public int triple(){
        return 3;
    }

}