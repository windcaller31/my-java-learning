package adaptor;

public class MediaAdapter implements MediaPlayer {
	VedioMediaPlayer vedioMediaPlayer;
	public MediaAdapter(String audioType){
		if(audioType.equals("vlc")){
			vedioMediaPlayer = new VlcPlayer();
		}else if(audioType.equals("mp4")){
			vedioMediaPlayer = new Mp4Player();
		}
	}
	
	public void playFile(String audioType,String fileName){
		if(audioType.equals("vlc")){
			vedioMediaPlayer.playVlc(fileName);
		}else if(audioType.equals("mp4")){
			vedioMediaPlayer.playMp4(fileName);
		}
	}
}
