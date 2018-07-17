package singleleton;

public class LazySafeFaster {
	public static LazySafeFaster lsf;
	private LazySafeFaster(){};
	//多线程情况下 两个 if 保证更高效
	public synchronized static LazySafeFaster getInstance(){
		if(lsf==null){
			synchronized (LazySafeFaster.class) {
				if(lsf==null){
					lsf = new LazySafeFaster();
				}
			}
		}
		return lsf;
	}
}
