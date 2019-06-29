package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int s = 0;


		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String sc1 = JOptionPane.showInputDialog("What has hands but cannot clap?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(sc1.contentEquals("A clock")) {
	 s = s+1;
	
	System.out.println("CORRECT! +1");
	
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	System.out.println("WRONG! +0");
}
		// 6. Add some more riddles
String sc2 = JOptionPane.showInputDialog("A man is pushing his car along the road when he comes to a hotel. He shouts, 'I'm bankrupt!' Why?");
if(sc2.contentEquals("He was playing Monopoly")) {
	s = s+1;
	System.out.println("CORRECT! +1");
}
else {
	System.out.println("WRONG! +0");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showConfirmDialog(null, "Your score is"+s+".");
	}
}

