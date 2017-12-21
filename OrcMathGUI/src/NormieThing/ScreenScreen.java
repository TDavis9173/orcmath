package NormieThing;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class ScreenScreen extends FullFunctionScreen{
	private TextArea text;
	private Button change;

	public ScreenScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		text = new TextArea(40,40,200,30,"I have a small");
		viewObjects.add(text);
		change = new Button(40,300,100,30,"Next",new Action() {
			
			@Override
			public void act() {
			CatalogMakerGUI.test.setScreen(CatalogMakerGUI.screen2);
			}
		});
		viewObjects.add(change);
	}

}
