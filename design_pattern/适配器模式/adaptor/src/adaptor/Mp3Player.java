package adaptor;

public class Mp3Player implements MediaPlayer {
	MediaAdapter mediaAdaper;
	//通过adaptor适配器实现具体方法
	//核心方法，调用adaptor的方法 扩展自己的实现类 ；主要用于扩展实现方法，兼容更多调用方式
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
