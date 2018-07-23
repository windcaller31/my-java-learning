
public class Sample {
	public static void main(String args[]){
		Stock abcStock = new Stock();
		BuyStock buyStock = new BuyStock(abcStock);
		SellStock sellStock = new SellStock(abcStock);
		
		//指令执行类加载指令类后执行
		Broker broker = new Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		broker.placeOrder();
	}
}
