import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
String answer = JOptionPane.showInputDialog("Three doctors said that Robert was their brother. Robert siad he had no brothers. Who is lying?");
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equals("None")) {
	score++;
	JOptionPane.showMessageDialog(null, "Correct!");
	
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Incorrect!");
}
		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog(null, "Where do fish go on vacation?");
if (answer2.equals("Finland")) {
	score++;
	JOptionPane.showMessageDialog(null, "Correct!");
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
String answer3 = JOptionPane.showInputDialog(null, "What belongs to you, but others use it more than you?");
if (answer3.equals("Your name")||answer3.equals("Name")||answer3.equals("your name")) {
	score++;
	JOptionPane.showMessageDialog(null, "Correct!");
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " +score);
	}
}

