package singleleton;

public class LazySafe {
	public static LazySafe ls;
	private LazySafe(){};
	public synchronized static LazySafe getInstance(){
		if(ls==null){
			ls = new LazySafe();
		}
		return ls;
	}
}
