//provide public setters and getters to modify and view variables
// good example only allows outside classes to perform necessary modification of the data while bad encapsulation
// could allow an outside class to get and set anything
//access modifiers can be used to set necessary fields to private or public
public class Encapsulation {
    public static void main(String[] args) throws Exception{
        
         }
}
class BankGood{
    private double balance;
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double x)
    {
        balance+=x;
    }
    public void withdraw(double x)
    {
        balance-=x;
    }
}
class BankBad{
    private double balance;
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double x)
    {
        balance=x;
    }
    
}