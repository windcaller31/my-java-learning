//sell指令类 包装了指令类
public class SellStock implements Order {
	
	private Stock abcStock;
	
	public SellStock(Stock sellStock){
		this.abcStock = sellStock;
	}
	
	public void excute() {
		abcStock.sell();
	}

}
