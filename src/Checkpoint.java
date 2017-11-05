import javax.swing.JOptionPane;

public class Checkpoint {
	public static void main(String[] args) {
		String answer = "yes";
		if (answer.equals("yes")) {
			System.out.println("happy");

		} else {
			System.out.println("sad");
		}
		System.out.println("Sunday");
		int age = 14;
		if (age <= 20) {
			System.out.println("It's so great being young!");
		} else {
			System.out.println("Don't you wish you were young");
		}
		String animal = JOptionPane.showInputDialog("What is your favorite animal?");
		if (animal.equals("dog")) {
			System.out.println("Dogs go woof");
		} else {
			if (animal.equals("cat")) {
				System.out.println("Cats go meow");
			} else {
				if (animal.equals("horse")) {
					System.out.println("Horses go neigh");
				} else {
					if (animal.equals("turtle")) {
						System.out.println("Turtles don't make a sound");
					} else {

						System.out.println("I don't know what a " + animal + " is");
					}
				}
			}

		}
	}

}
