package cn.lmq.oop.cllback;

public class PaintFrame {
	public static  void drawFrame(MyFrame f){
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息");
		//画窗口
		f.paint();
		System.out.println("启动缓存，增加效率");
		
	}
	public static void main(String[] args) {
		drawFrame(new GameFrame02());
	}

}
class GameFrame01 /*extends*/extends /* implements*/ MyFrame{
	    public void paint() {
		System.out.println("GameFrame01()");
		System.out.println("画窗口");
	}

}
class GameFrame02 /*extends*/extends/*implements*/ MyFrame{
    public void paint() {
	System.out.println("GameFrame02()");
	System.out.println("画窗口");
   }

}