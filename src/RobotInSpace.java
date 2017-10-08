/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */


	import java.awt.KeyEventDispatcher; 
	import java.awt.KeyboardFocusManager; 
	import java.awt.event.KeyEvent; 
	import java.io.File;
	import javax.sound.sampled.AudioInputStream; 
	import javax.sound.sampled.AudioSystem; 
	import javax.sound.sampled.Clip;

import org.jointheleague.graphical.robot.Robot;

	
	public class RobotInSpace implements KeyEventDispatcher {
		
	Robot jimmy = new Robot("mini");

	/*  Make the Robot move around the screen when the arrow keys are pressed... */
	private void moveRobot(int keyPressed){
	    // 0. Print out the keyPressed variable and write down the numbers for each arrow key
System.out.println(keyPressed);
	    // 1. If the up arrow is pressed, move the Robot up the screen.38
if(keyPressed==38) {
	jimmy.setAngle(0);
	jimmy.move(10);
}
	    // 2. If the down arrow is pressed, move the Robot down.40
if(keyPressed==40) {
	jimmy.setAngle(180);
	jimmy.move(10);

}
	    // 3. If the left arrow is pressed, make the Robot go left. Hint: Make sure to end with the Robot facing UP.37
	    if(keyPressed==37) {
	    	jimmy.setAngle(270);
	    	jimmy.move(10);
	    }
	    // 4. If right is pressed, move the Robot right.39
	    if(keyPressed==39) {
	    	jimmy.setAngle(90);
	    	jimmy.move(10);
	    }
	    // 5. Then move the Robot to RD-2D for a surprise! 
	}

	private void checkIfR2D2Found() throws Exception {
	    int robotLocationX = jimmy.getX();
	    int robotLocationY = jimmy.getY();

		if (robotLocationX <= 7300 && robotLocationX >= 720 && robotLocationY >= 150 && robotLocationY <= 160)
	        playEureka();
	}

	public static void main(String[] args) {
	    new RobotInSpace().controlTheRobot();
	}


	private void controlTheRobot() {
	    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
	    jimmy.setWindowImage("planet.jpg");
	    
	    jimmy.penUp();
	    jimmy.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
	    if (e.getID() == KeyEvent.KEY_PRESSED) {
	        moveRobot(e.getKeyCode());
	        try {
	            checkIfR2D2Found();
	        } catch (Exception exception) {
	        }
	    }
	    return false;
	}

	public void playEureka() {
	    System.out.println("EUREKA!");
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(
	                "/Users/League/Google Drive/league-sounds/r2d2-eureka.wav"));
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}
	}


