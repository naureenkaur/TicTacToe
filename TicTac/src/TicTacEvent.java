import javax.swing.*; // imports libraries we need 
import java.awt.event.*;
import java.awt.*;

public class TicTacEvent implements ItemListener, ActionListener, Runnable {
	// creates a class that responds to mouse and keyboard input by "listening" 
	TicTac gui; // associates the game board with the event
	ImageIcon a = new ImageIcon("Adidas.jpg"); // sets x.jpg to image icon a. 
	ImageIcon b = new ImageIcon("Nike.jpg"); // sets o.jpg to image icon b.
	ImageIcon c = new ImageIcon("cardback.jpg"); // sets o.jpg to image icon b.
	int clicks = 0; // checks the number of turns 
	int win = 0; // created to check for a winner
	int tie = 0; // created to check for the number of ties
	int adidas = 0; // created to check for the number of wins adidas has 
	int nike = 0; // created to check for the number of wins nike has
	int[][] check = new int[3][3]; //2D array to check the value in each box
	public TicTacEvent (TicTac in) { // associates the two files to be used together
		gui = in;
		for (int row = 0; row <=2; row++) { // initiates the winner check array 
			for (int col = 0; col <=2; col++) {
				check[row][col] = 0;
			}
		}
	}
	public void actionPerformed (ActionEvent event) {
		// Tells the program what to do when a button is clicked
		String command = event.getActionCommand();
		// takes the button name as input from the button that is clicked
		if(command.equals("1")) { //if button labelled 1 is pressed 
			b1(); // run the b1() method code below
		}
		if(command.equals("2")) {
			b2();
		}
		if(command.equals("3")) {
			b3();
		}
		if(command.equals("4")) {
			b4();
		}
		if(command.equals("5")) {
			b5();
		}
		if(command.equals("6")) {
			b6();
		}
		if(command.equals("7")) {
			b7();
		}
		if(command.equals("8")) {
			b8();
		}
		if(command.equals("9")) {
			b9();
		}
	}
	
	void b1() { //creates methods b1 to b9to handle clicks on each game square
		clicks = clicks + 1; // keeps track of the number of boxes chosen
		if((clicks%2)==1) {
			check[0][0] = 1; // if box in array position [0][0] top left corner is pressed
			gui.boxes[0][0].setEnabled(false);
			// disabled the box, so it can't be pressed again
			gui.boxes[0][0].setDisabledIcon(a);
			// set the image of the disabled box to (x.jpg)
		} else { // puts nike on the board and declares that square to be taken
			check[0][0] = 2;
			gui.boxes[0][0].setEnabled(false);
			gui.boxes[0][0].setDisabledIcon(b);
		}
		winner();
	}
	
	void b2() { //creates methods b1 to b9to handle clicks on each game square
		clicks = clicks + 1; // keeps track of the number of boxes chosen
		if((clicks%2)==1) {
			check[0][1] = 1; // if box in array position [0][1]
			gui.boxes[0][1].setEnabled(false);
			// disabled the box, so it can't be pressed again
			gui.boxes[0][1].setDisabledIcon(a);
			// set the image of the disabled box to (x.jpg)
		} else { // puts nike on the board and declares that square to be taken
			check[0][1] = 2;
			gui.boxes[0][1].setEnabled(false);
			gui.boxes[0][1].setDisabledIcon(b);
		}
		winner();
	}
	
	void b3() { //creates methods b1 to b9to handle clicks on each game square
		clicks = clicks + 1; // keeps track of the number of boxes chosen
		if((clicks%2)==1) {
			check[0][2] = 1; // if box in array position [0][1]
			gui.boxes[0][2].setEnabled(false);
			// disabled the box, so it can't be pressed again
			gui.boxes[0][2].setDisabledIcon(a);
			// set the image of the disabled box to (x.jpg)
		} else { // puts nike on the board and declares that square to be taken
			check[0][2] = 2;
			gui.boxes[0][2].setEnabled(false);
			gui.boxes[0][2].setDisabledIcon(b);
		}
		winner();
	}
	
	void b4() { //creates methods b1 to b9to handle clicks on each game square
		clicks = clicks + 1; // keeps track of the number of boxes chosen
		if((clicks%2)==1) {
			check[1][0] = 1; // if box in array position [0][1]
			gui.boxes[1][0].setEnabled(false);
			// disabled the box, so it can't be pressed again
			gui.boxes[1][0].setDisabledIcon(a);
			// set the image of the disabled box to (x.jpg)
		} else { // puts nike on the board and declares that square to be taken
			check[1][0] = 2;
			gui.boxes[1][0].setEnabled(false);
			gui.boxes[1][0].setDisabledIcon(b);
		}
		winner();
	}
	
	void b5() { //creates methods b1 to b9to handle clicks on each game square
		clicks = clicks + 1; // keeps track of the number of boxes chosen
		if((clicks%2)==1) {
			check[1][1] = 1; // if box in array position [0][1]
			gui.boxes[1][1].setEnabled(false);
			// disabled the box, so it can't be pressed again
			gui.boxes[1][1].setDisabledIcon(a);
			// set the image of the disabled box to (x.jpg)
		} else { // puts nike on the board and declares that square to be taken
			check[1][1] = 2;
			gui.boxes[1][1].setEnabled(false);
			gui.boxes[1][1].setDisabledIcon(b);
		}
		winner();
	}
	
	void b6() { //creates methods b1 to b9to handle clicks on each game square
		clicks = clicks + 1; // keeps track of the number of boxes chosen
		if((clicks%2)==1) {
			check[1][2] = 1; // if box in array position [0][1]
			gui.boxes[1][2].setEnabled(false);
			// disabled the box, so it can't be pressed again
			gui.boxes[1][2].setDisabledIcon(a);
			// set the image of the disabled box to (x.jpg)
		} else { // puts nike on the board and declares that square to be taken
			check[1][2] = 2;
			gui.boxes[1][2].setEnabled(false);
			gui.boxes[1][2].setDisabledIcon(b);
		}
		winner();
	}
	
	void b7() { //creates methods b1 to b9to handle clicks on each game square
		clicks = clicks + 1; // keeps track of the number of boxes chosen
		if((clicks%2)==1) {
			check[2][0] = 1; // if box in array position [0][1]
			gui.boxes[2][0].setEnabled(false);
			// disabled the box, so it can't be pressed again
			gui.boxes[2][0].setDisabledIcon(a);
			// set the image of the disabled box to (x.jpg)
		} else { // puts nike on the board and declares that square to be taken
			check[2][0] = 2;
			gui.boxes[2][0].setEnabled(false);
			gui.boxes[2][0].setDisabledIcon(b);
		}
		winner();
	}
	
	void b8() { //creates methods b1 to b9to handle clicks on each game square
		clicks = clicks + 1; // keeps track of the number of boxes chosen
		if((clicks%2)==1) {
			check[2][1] = 1; // if box in array position [0][1]
			gui.boxes[2][1].setEnabled(false);
			// disabled the box, so it can't be pressed again
			gui.boxes[2][1].setDisabledIcon(a);
			// set the image of the disabled box to (x.jpg)
		} else { // puts nike on the board and declares that square to be taken
			check[2][1] = 2;
			gui.boxes[2][1].setEnabled(false);
			gui.boxes[2][1].setDisabledIcon(b);
		}
		winner();
	}
	
	void b9() { //creates methods b1 to b9to handle clicks on each game square
		clicks = clicks + 1; // keeps track of the number of boxes chosen
		if((clicks%2)==1) {
			check[2][2] = 1; // if box in array position [0][1]
			gui.boxes[2][2].setEnabled(false);
			// disabled the box, so it can't be pressed again
			gui.boxes[2][2].setDisabledIcon(a);
			// set the image of the disabled box to (x.jpg)
		} else { // puts nike on the board and declares that square to be taken
			check[2][2] = 2;
			gui.boxes[2][2].setEnabled(false);
			gui.boxes[2][2].setDisabledIcon(b);
		}
		winner();
	}
	
	void winner() { // checks row for winner
		for(int x = 0; x<=2; x++) { // checks each row
			if((check[x][0]==check[x][1])&&(check[x][0]==check[x][2])) { 
				// checks to see if all entries are adidas, or all entries are nike.
				if(check[x][0]==1) { // if all x
					JOptionPane.showMessageDialog(null,  "Adidas is the winner");
					// creates a pop up box declaring a winner
					win = 1;
					adidas++; // adidas will increase by 1 if adidas is the winner
					gui.txtAdidas.setText("Adidas wins: " + adidas); 
					// change the text in the textbox to show the number of adidas wins
					gui.txtAdidas.setBackground(Color.YELLOW); // the colour of the txtbox will change for emphasis
				} else if(check[x][0]==2) { // if all Nike
					JOptionPane.showMessageDialog(null, "Nike is the winner");
					win = 1;
					nike++; // nike will increase by one if nike is the winner
					gui.txtNike.setText("Nike wins: " + nike); 
					// the txtbox text will change that shows the number of nike wins
					gui.txtNike.setBackground(Color.YELLOW); // the colour of the txtbox will change for emphasis
				}
			}
		}
		
		/** check columns for winner*/
		for(int x = 0; x <= 2; x++) { // checks each column
			if((check[0][x]==check[1][x])&&(check[0][x]==check[2][x])) {
				// check to see if all entries are adidas, or all entries are nike
				if(check[0][x]==1) { // if all adidas
					JOptionPane.showMessageDialog(null, "Adidas is the winner");
					// pop up box that declares the winner 
					win = 1;
					adidas++; // adidas will increase by 1 if adidas is the winner
					gui.txtAdidas.setText("Adidas wins: " + adidas); 
					// the txtbox text will change that shows the number of adidas wins
					gui.txtAdidas.setBackground(Color.YELLOW); // the colour of the txtbox will change for emphasis
				} else if(check[0][x]==2) {  // if all nike
					JOptionPane.showMessageDialog(null, "Nike is the winner");
					win = 1;
					nike++; // nike will increase by one if nike is the winner
					gui.txtNike.setText("Nike wins: " + nike); 
					// the txtbox text will change that shows the number of nike wins
					gui.txtNike.setBackground(Color.YELLOW); // the colour of the txtbox will change for emphasis
				}
			}
		}
		
		/** checks diagonal for winner*/
		if(((check[0][0]==check[1][1])&&(check[0][0]==check[2][2])) || 
		((check[2][0]==check[1][1]&&(check[1][1]==check[0][2])))) {
			// checks for diagonal matches
			if(check[1][1]==1) { // checks for adidas winner
				JOptionPane.showMessageDialog(null, "Adidas is the winner");
				win = 1;
				adidas++; // adidas will increase by 1 if adidas is the winner
				gui.txtAdidas.setText("Adidas wins: " + adidas); 
				// the txtbox text will change that shows the number of adidas wins
				gui.txtAdidas.setBackground(Color.YELLOW); // the colour of the txtbox will change for emphasis
			} else if(check[1][1]==2) { // checks O for winner
				JOptionPane.showMessageDialog(null, "Nike is the winner");
				win = 1;
				nike++; // o will increase by one if o is the winner
				gui.txtNike.setText("Nike wins: " + nike); 
				// the txtbox text will change that shows the number of nike wins
				gui.txtNike.setBackground(Color.YELLOW); //  the colour of the txtbox will change for emphasis
			}
		}
		
		/** Checks if the game is a tie*/
		if((clicks==9)&&(win==0)) {
			/** This structure checks to see if 9 boxes have been chosen (clicks)
			 * and that a winner has not been declared (win==0)*/
			JOptionPane.showMessageDialog(null, "The game is a tie");
			tie++; // tie will increment by one when the game is a tie
			gui.txtTie.setText("Ties: " + tie); // the txtbox text will change that shows the number of ties
			gui.txtTie.setBackground(Color.YELLOW); // the colour of the txtbox will change for emphasis
		}
	}
	
	public void itemStateChanged(ItemEvent e) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	public void run() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
} // End of code
