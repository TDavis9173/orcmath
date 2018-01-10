package theosimon;

import guiTeacher.GUIApplication;

public class SimonGameTheo extends GUIApplication {

	public SimonGameTheo(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
		setVisible(true);
	}

	@Override
	public void initScreen() {
		SimonScreenTheo screen = new SimonScreenTheo(getWidth(),getHeight());
		setScreen(screen);

	}

	public static void main(String[] args) {
		SimonGameTheo test = new SimonGameTheo(600,800);
		test.initScreen();
		Thread t = new Thread(test);
		t.start();

	}

}
