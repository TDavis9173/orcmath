package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Countries extends Component {
	private String flag;
	private String name;
	private String lang;

	public Countries(String name,String flag,String lang) {
		super(40, 40, 100, 100);
		this.name=name;
		this.flag=flag;
		this.lang=lang;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.green);
		g.fillRect(0, 0, getWidth(), getHeight());
	}
	public String toString() {
		return flag+","+name+","+lang;
	}

}
