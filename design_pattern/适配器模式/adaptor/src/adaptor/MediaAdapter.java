package adaptor;
//适配器
public class MediaAdapter implements MediaPlayer {
	VedioMediaPlayer vedioMediaPlayer;
	//先初始化已有接口对应的实现类
	public MediaAdapter(String audioType){
		if(audioType.equals("vlc")){
			vedioMediaPlayer = new VlcPlayer();
		}else if(audioType.equals("mp4")){
			vedioMediaPlayer = new Mp4Player();
		}
	}

	//实现适配器通用方法达到适配新的类型的模式
	//核心方法，adapter的方法包括了两个实现类的具体方法，将多个实现类的方法，由一个控制方法暴露出去
	public void playFile(String audioType,String fileName){
		if(audioType.equals("vlc")){
			vedioMediaPlayer.playVlc(fileName);
		}else if(audioType.equals("mp4")){
			vedioMediaPlayer.playMp4(fileName);
		}
	}
}
