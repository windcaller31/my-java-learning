package singleleton;

public class LazyNotSafe {
	public static LazyNotSafe lns;
	private LazyNotSafe(){};
	public static LazyNotSafe getInstance(){
		if(lns==null){
			lns = new LazyNotSafe();
		}
		return lns;
	}
}
