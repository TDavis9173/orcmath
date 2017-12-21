package NormieThing;

import guiTeacher.GUIApplication;

public class CatalogMakerGUI extends GUIApplication {
	public static CatalogMakerGUI test;
	 public static ScreenScreen screen1;
	 public static AnotherScreen screen2;

	public CatalogMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		screen1 = new ScreenScreen(getWidth(), getHeight());
		screen2 = new AnotherScreen(getWidth(), getHeight());
		setScreen(screen1);

	}

	public static void main(String[] args) {
		test = new CatalogMakerGUI(800,550);
		Thread go = new Thread(test);
		go.start();
	}

}
