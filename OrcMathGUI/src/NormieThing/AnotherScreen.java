package NormieThing;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class AnotherScreen extends FullFunctionScreen {
	private TextArea text;
	private Button change;

	public AnotherScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		text = new TextArea(40,40,200,30," haHAA");
		Graphic level = new Graphic(200,200, "resources/triggered.jpg");
		viewObjects.add(level);
		viewObjects.add(text);
		change = new Button(40,300,100,30,"Back",new Action() {
			
			@Override
			public void act() {
			CatalogMakerGUI.test.setScreen(CatalogMakerGUI.screen1);
			}
		});
		viewObjects.add(change);
	}

}
