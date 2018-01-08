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
		final Button b1 = new Button(0, 0, 100, 100, "", new Action(){

			public void act(){
				if(isUserTurn) {
					Thread blink = new Thread(new Runnable(){

						public void run(){
						
							b1.setBackground(b1.getBackgroundColor().brighter());
							try {
								Thread.sleep(800);
								} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								}
							b1.setBackground(b1.getBackgroundColor().darker());
						}
						});
					blink.start();
					if(b1==moves.get(move).getButton()) {
						move++;
					}else {
						ProgressInterfaceTheo.gameOver();
					}
					if(move == moves.size()){ 
					    Thread nextRound = new Thread(SimonScreenTheo.this); 
					    nextRound.start(); 
					}
				}
			}

			});
		b1.setBackground(Color.BLUE);
		b1.setAction(new Action(){

			public void act(){
				if(isUserTurn) {
					Thread blink = new Thread(new Runnable(){

						public void run(){
						
							b1.setBackground(b1.getBackgroundColor().brighter());
							try {
								Thread.sleep(800);
								} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								}
							b1.setBackground(b1.getBackgroundColor().darker());
						}
						});
					blink.start();
					if(b1==moves.get(move).getButton()) {
						move++;
					}else {
						ProgressInterfaceTheo.gameOver();
					}
					if(move == moves.size()){ 
					    Thread nextRound = new Thread(SimonScreenTheo.this); 
					    nextRound.start(); 
					}
				}
			}

			});

		viewObjects.add(b1); 
		Button b2 = null;
		b2.setBackground(Color.RED);
		b2.setX(0);
		b2.setY(0);
		b2.setAction(new Action(){

			public void act(){
				if(isUserTurn) {
					Thread blink = new Thread(new Runnable(){

						public void run(){
						
							b2.setBackground(b2.getBackgroundColor().brighter());
							try {
								Thread.sleep(800);
								} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								}
								b2.setBackground(b2.getBackgroundColor().darker());
						}
						});
					blink.start();
					if(b2==moves.get(move).getButton()) {
						move++;
					}else {
						ProgressInterfaceTheo.gameOver();
					}
					if(move == moves.size()){ 
					    Thread nextRound = new Thread(SimonScreenTheo.this); 
					    nextRound.start(); 
					}
				}
			}

			});
		viewObjects.add(b2); 
		Button b3 = null;
		b3.setBackground(Color.GREEN);
		b3.setX(0);
		b3.setY(0);
		b3.setAction(new Action(){

			public void act(){
				if(isUserTurn) {
					Thread blink = new Thread(new Runnable(){

						public void run(){
						
							b3.setBackground(b3.getBackgroundColor().brighter());
							try {
								Thread.sleep(800);
								} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								}
								b3.setBackground(b3.getBackgroundColor().darker());
						}
						});
					blink.start();
					if(b3==moves.get(move).getButton()) {
						move++;
					}else {
						ProgressInterfaceTheo.gameOver();
					}
					if(move == moves.size()){ 
					    Thread nextRound = new Thread(SimonScreenTheo.this); 
					    nextRound.start(); 
					}
				}
			}

			});
		viewObjects.add(b3); 
		Button b4 = null;
		b4.setBackground(Color.YELLOW);
		b4.setX(0);
		b4.setY(0);
		b4.setAction(new Action(){

			public void act(){
				if(isUserTurn) {
					Thread blink = new Thread(new Runnable(){

						public void run(){
						
							b4.setBackground(b4.getBackgroundColor().brighter());
							try {
								Thread.sleep(800);
								} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								}
								b4.setBackground(b4.getBackgroundColor().darker());
						}
						});
					blink.start();
					if(b1==moves.get(move).getButton()) {
						move++;
					}else {
						ProgressInterfaceTheo.gameOver();
					}
					if(move == moves.size()){ 
					    Thread nextRound = new Thread(SimonScreenTheo.this); 
					    nextRound.start(); 
					}
				}
			}

			});
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

	@Override
	public void run() {
		text.setText("");
		nextRound();
	}

	private void nextRound() {
		moves.add(newMove());
		
	}
	
}
