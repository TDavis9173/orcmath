package theosimon;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenTheo extends ClickableScreen implements Runnable{
	ProgressInterfaceTheo test;
	ArrayList<MoveInterfaceTheo> moves;
	int move;
	boolean isUserTurn;
	

	public SimonScreenTheo(int width, int height) {
		super(width, height);
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		ButtonInterfaceTheo b1 = getAButton();
		b1.setColor(Color.BLUE);
		ButtonInterfaceTheo b2 = getAButton();
		b2.setColor(Color.RED);
		ButtonInterfaceTheo b3 = getAButton();
		b3.setColor(Color.GREEN);
		ButtonInterfaceTheo b4 = getAButton();
		b4.setColor(Color.YELLOW);
		TextArea text = new TextArea();

	}


private ProgressInterfaceTheo getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

//finish with partner
	private ButtonInterfaceTheo getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		for(int i = 0;i<moves.size();i++) {
			
		}
		Thread play = new Thread(SimonScreenTheo.this);
		play.start();
	}
	
}
