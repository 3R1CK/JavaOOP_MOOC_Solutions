
public class Main {

    public static void main(String[] args) {
        CashRegister unicafe = new CashRegister();
        System.out.println(unicafe);
        
        LyyraCard cardOfJim = new LyyraCard(2);
        
        System.out.println("the card balance "+cardOfJim.balance()+ " euros");
        
        boolean succeeded = unicafe.payGourmet(cardOfJim);
        System.out.println("payment success: "+ succeeded);
        
        unicafe.loadMoneyToCard(cardOfJim, 100);
        
        succeeded = unicafe.payGourmet(cardOfJim);
        System.out.println("payment success " + succeeded);
        
        System.out.println("the card balance "+ cardOfJim.balance() + " euros");
        
        System.out.println(unicafe);
    }
}
