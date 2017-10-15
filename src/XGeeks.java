//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String Garrett = "being the best";
String Keith = "writing code";
String Yabraksi = "superspeed";
String Kanvar = "jumping super high";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Enter a name:");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if(name.equals("Garrett")) {
JOptionPane.showMessageDialog(null, "Garrett's superpower is "+Garrett);
	}
if(name.equals("Keith")) {
JOptionPane.showMessageDialog(null, "Keith's superpower is "+Keith);
	}
if(name.equals("Yabraksi")) {
JOptionPane.showMessageDialog(null, "Yabraksi's superpower is "+Yabraksi);
	}
if(name.equals("Kanvar")) {
JOptionPane.showMessageDialog(null, "Kanvar's superpower is "+Kanvar);
	}
}
}

