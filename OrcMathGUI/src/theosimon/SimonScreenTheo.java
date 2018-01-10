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
	private ArrayList<Integer> moves;
	private int move;
	private boolean isUserTurn;
	private TextLabel text;
	private int lastMove;
	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;

	public SimonScreenTheo(int width, int height) {
		super(width, height);
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		 Button b1 = new Button(0, 0, 100, 100, "", new Action(){

			public void act(){
				if(isUserTurn) {
						blink(1);
					if(1==moves.get(move)) {
						move++;
					}else {
						gameOver();
					}
					if(move == moves.size()){ 
					    run();
					}
				}
			}

			});
		b1.setBackground(Color.BLUE);
		viewObjects.add(b1); 
		Button b2 = new Button(100, 0, 100, 100, "", new Action(){

			public void act(){
				if(isUserTurn) {
					blink(2);
				if(2==moves.get(move)) {
					move++;
				}else {
					gameOver();
				}
				if(move == moves.size()){ 
				    run();
				}
			}
		}

		});
		b2.setBackground(Color.RED);
		viewObjects.add(b2); 
		Button b3 = new Button(0, 100, 100, 100, "", new Action(){

			public void act(){
				if(isUserTurn) {
					blink(3);
				if(3==moves.get(move)) {
					move++;
				}else {
					gameOver();
				}
				if(move == moves.size()){ 
				    run();
				}
			}
		}

		});
		b3.setBackground(Color.GREEN);
		viewObjects.add(b3); 
		Button b4 = new Button(100, 100, 100, 100, "", new Action(){

			public void act(){
				if(isUserTurn) {
					blink(4);
				if(4==moves.get(move)) {
					move++;
				}else {
					gameOver();
				}
				if(move == moves.size()){ 
				    run();
				}
			}
		}

		});
		b4.setBackground(Color.YELLOW);
		viewObjects.add(b4); 
		move =0;
		lastMove=-1;
		text = new TextLabel(300,200,300,40,"text");
		moves = new ArrayList<Integer>();
		moves.add(newMove());
		moves.add(newMove());
		b1.setVisible(true);
		b2.setVisible(true);
		b3.setVisible(true);
		b4.setVisible(true);
		text.setVisible(true);
		isUserTurn= false;
		run();
	}


	public int newMove() {
		int i = (int)(Math.random()*4);
		while(i == lastMove) {
			i = (int)(Math.random()*4);
		}
		lastMove=1;
		return i;
	}

	@Override
	public void run() {
		text.setText("Simon's turn");
		nextRound();
	}

	public void nextRound() {
		Thread turn = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				isUserTurn=false;
				moves.add(newMove());
				for(int i =0;i<moves.size();i++) {
					if(moves.get(i)==1) {
						blink(1);
					}
					if(moves.get(i)==2) {
						blink(2);
					}
					if(moves.get(i)==3) {
						blink(3);
					}
					if(moves.get(i)==4) {
						blink(4);
					}
				}
				move =0;
				text.setText("Your turn");
				isUserTurn=true;
			}
		});
		turn.start();
		
	}
	public void gameOver() {
		// TODO Auto-generated method stub
		
	}
	public void blink(int b) {
		Thread test = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				if(b==1) {
					b1.setBackground(Color.BLACK);
					try {
						Thread.sleep(800);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					b1.setBackground(Color.BLUE);
				}
				if(b==2) {
					b2.setBackground(Color.BLACK);
					try {
						Thread.sleep(800);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					b2.setBackground(Color.RED);
				}
				if(b==3) {
					b3.setBackground(Color.BLACK);
					try {
						Thread.sleep(800);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					b3.setBackground(Color.GREEN);
				}
				if(b==4) {
					b3.setBackground(Color.BLACK);
					try {
						Thread.sleep(800);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					b3.setBackground(Color.YELLOW);
				}
			}
		});
		test.start();
	}
	
}
