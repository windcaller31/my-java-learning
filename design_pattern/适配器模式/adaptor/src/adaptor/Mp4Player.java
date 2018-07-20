package adaptor;

public class Mp4Player implements VedioMediaPlayer{

	@Override
	public void playVlc(String name) {
		
	}

	@Override
	public void playMp4(String name) {
		System.out.println("play mp4 name:"+name);
	}

}
