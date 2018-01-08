package theosimon;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenTheo extends ClickableScreen implements Runnable{
	ProgressInterfaceTheo test;
	ArrayList<MoveInterfaceTheo> moves;
	int move;
	boolean isUserTurn;
	TextLabel text;
	int lastMove;
	

	public SimonScreenTheo(int width, int height) {
		super(width, height);
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		final ButtonInterfaceTheo b1 = getAButton();
		b1.setColor(Color.BLUE);
		b1.setX(0);
		b1.setY(0);
		b1.setAction(new Action(){

			public void act(){
				if(isUserTurn) {
					Thread blink = new Thread(new Runnable(){

						public void run(){
						}

						});
					
				}
			}

			});

		viewObjects.add(b1); 
		ButtonInterfaceTheo b2 = getAButton();
		b2.setColor(Color.RED);
		viewObjects.add(b2); 
		ButtonInterfaceTheo b3 = getAButton();
		b3.setColor(Color.GREEN);
		viewObjects.add(b3); 
		ButtonInterfaceTheo b4 = getAButton();
		b4.setColor(Color.YELLOW);
		viewObjects.add(b4); 
		move =0;
		lastMove=-1;
		text = new TextLabel(100,200,300,40,"text");
		moves = new ArrayList<MoveInterfaceTheo>();
		moves.add(newMove());
		moves.add(newMove());
		test = progress();
	}


private MoveInterfaceTheo newMove() {
		int i = (int)(Math.random()*4);
		while(i == lastMove) {
			i = (int)(Math.random()*4);
		}
		return getMove(i);
	}

private MoveInterfaceTheo getMove(int i) {
	// TODO Auto-generated method stub
	return null;
}

private ProgressInterfaceTheo progress() {
		// TODO Auto-generated method stub
		return null;
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
		text.setText("");
		nextRound();
	}

	private void nextRound() {
		moves.add(newMove());
		
	}
	
}
