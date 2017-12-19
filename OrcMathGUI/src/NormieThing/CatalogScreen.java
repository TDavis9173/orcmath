package NormieThing;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {
	private TextField name;
	private TextField title;
	private TextField page;
	private Button add;
	public CatalogScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		name = new TextField(40,40,400,30,"Text goes here ","Name");
		viewObjects.add(name);
		title = new TextField(40,140,400,30,"Text goes here ","Title");
		viewObjects.add(title);
		page = new TextField(40,240,400,30,"Text goes here ","Page");
		viewObjects.add(page);
		add = new Button(40,300,100,30,"Add",new Action() {
			
			@Override
			public void act() {
				name.setText("Normie get out REEEEEEEEEEE");
			}
		});
		viewObjects.add(add);

	}

}
