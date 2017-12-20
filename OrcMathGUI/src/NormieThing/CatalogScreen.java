package NormieThing;

import java.awt.Color;
import java.util.List;

import guiPlayer.CatalogMake;
import guiPlayer.Countries;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {
	private TextField name;
	private TextField flag;
	private TextField lang;
	private Button add;
	private TextArea text;
	private CatalogMake catalog;
	public CatalogScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		catalog = new CatalogMake();
		name = new TextField(40,40,200,30,"Text goes here ","Name");
		viewObjects.add(name);
		flag = new TextField(40,140,200,30,"Text goes here ","Flag");
		viewObjects.add(flag);
		lang = new TextField(40,240,200,30,"Text goes here ","Lang");
		viewObjects.add(lang);
		text = new TextArea(300,40,400,200,"ok");
		viewObjects.add(text);
		add = new Button(40,300,100,30,"Add",new Action() {
			
			@Override
			public void act() {
				addbuttonClicked();
			}
		});
		viewObjects.add(add);

	}

	public void addbuttonClicked() {
		if(name.getText()=="") {
			Color red = new Color(255,0,0); 
			name.setBackground(red);
		}
		if(flag.getText()=="") {
			Color red = new Color(255,0,0);
			flag.setBackground(red);
		}
		if(flag.getText()=="") {
			Color red = new Color(255,0,0);
			flag.setBackground(red);
		}
		if(name.getText()!="" && flag.getText()!="" && flag.getText()!="") {
		Countries c = new Countries(name.getText(),flag.getText(),lang.getText());
		String s = text.getText()+c+"\n";
		text.setText(s);
		catalog.addCountries(c);
		name.setText("");
		flag.setText("");
		lang.setText("");
		Color white = new Color (255,255,255);
		name.setBackground(white);
		flag.setBackground(white);
		flag.setBackground(white);
		}
	}

}
