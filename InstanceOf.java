public class InstanceOf {
    public static void main(String[] args) throws Exception{
                animal mycat=new dog();
                if(mycat instanceof cat){
                    System.out.println("It's a cat!");
                }
                animal mypet=(animal)mycat;

         }
}
 class animal{

}
 class dog extends animal{

}
 class cat extends animal{

}