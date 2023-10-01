package practice;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	public void go(int input) {
		
		run();
		for(int i=0;i<input;i++) {
			jump();
		}
		turn();
	}
}
