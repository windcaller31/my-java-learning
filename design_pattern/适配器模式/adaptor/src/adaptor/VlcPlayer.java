package adaptor;

public class VlcPlayer implements VedioMediaPlayer{

	@Override
	public void playVlc(String name) {
		System.out.println("play Vlc name:"+name);
	}

	@Override
	public void playMp4(String name) {
		
	}

}
