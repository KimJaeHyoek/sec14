
public class FanRunner {
	public static void main(String[] args) {
		
	
	Fan fan = new Fan("신일선풍기",0.34567,"초록");
	fan.switchOn();
	System.out.println(fan);
	fan.setSpeed((byte)3);
	System.out.println(fan);
	fan.switchOff();
	System.out.println(fan);
	}

}
