
public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	public final void play(){
		//初始化
		initialize();
		startPlay();
		endPlay();
	}
}
