import java.util.ArrayList;
import java.util.List;

//对应命令执行者
public class Broker {
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrder() {
		for (Order order : orderList) {
			order.excute();
		}
		orderList.clear();
	}
}
