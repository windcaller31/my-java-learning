package adaptor;

public class Mp3Player implements MediaPlayer {
	MediaAdapter mediaAdaper;
	
	public void playFile(String audioType, String fileName) {
		if(audioType.equals("mp3")){
			System.out.println("play mp3 file name:"+fileName);
		}else if(audioType.equals("mp4")
				||audioType.equals("vlc")){
			mediaAdaper = new MediaAdapter(audioType);
			mediaAdaper.playFile(audioType, fileName);
		}else {
			System.out.println("not support");
		}
	}

}
