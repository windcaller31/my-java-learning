//指令抽象类
public class Stock {
	private String name = "ABC";
	private int quantity = 10;
	
	public void buy(){
		System.out.println(" I buy "+name+" ,quantity is :"+quantity );
	}
	
	public void sell(){
		System.out.println(" I sell "+name+" ,quantity is :"+quantity );
	}
}
