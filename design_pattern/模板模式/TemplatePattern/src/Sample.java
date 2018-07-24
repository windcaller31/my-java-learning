
public class Sample {
	public static void main(String args[]){
		Game footBall = new Football();
		footBall.startPlay();
		footBall.endPlay();
		
		Game basketBall = new Basketball();
		basketBall.initialize();
	}
}
