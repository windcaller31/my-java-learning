package singleleton;

public class LazySafeFaster {
	public static LazySafeFaster lsf;
	private LazySafeFaster(){};
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
