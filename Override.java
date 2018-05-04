//can provide a specific implementation to a child class, however if overused can change what a class does
public class Override {
    public static void main(String[] args) throws Exception{
            new animal().run();
            new fish().run();
         }
}
 class animal{
    public static void run(){
        System.out.println("I'm running");
    }
}
 class fish extends animal{
    public static void run(){
        System.out.println("I can't run!");
    }
}