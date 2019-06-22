package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Matt = "Matt is smart";
String Isaac = "Isaac is very smart";
String Uriel = "Uriel is extremely smart";

		// 2. Ask the user to enter a name. Store their answer in a variable.
String n = JOptionPane.showInputDialog("What is your name?");

		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(n.equals("Matt")) {
	System.out.println(""+Matt+"");
	}
if(n.equals("Isaac")) {
	System.out.println(""+Isaac+"");
}
if(n.contentEquals("Uriel")) {
	System.out.println(""+Uriel+"");
}
}
}

