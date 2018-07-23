//buy指令类 包装了指令类
public class BuyStock implements Order {

	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void excute() {
		abcStock.buy();
	}

}
