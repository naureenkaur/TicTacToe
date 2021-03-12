import java.awt.*; //import the libraries needed in this app
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

/**
 * File Name: TicTac
 * Programmer:	Naureen Kaur
 * Date: March 18 2018
 * Description: This program demonstrates the basic TicTacToe game using graphics  
 * and allowing user input through buttons and displaying data to the user in textboxes
 * as well using two classes working together to form the game
**/

public class TicTac extends JFrame { 
	//sets up our TicTac class gets access to everything in the JFrame class 
    TicTacEvent tictac = new TicTacEvent(this); 
    //joins the two programs (TicTac.java and TicTacEvent.java) to work with each other.
    JPanel row1 = new JPanel();  //creates a new frame
    JButton[][] boxes = new JButton[3][3]; 
    /**create a 2D grid of arrays for the 9 buttons, 
     * sets aside memory spots for them, but doesn't create them yet. 
       The spaces have no context in them yet.*/
    JOptionPane win = new JOptionPane("Winner"); //will pop-up and declare the winner
   
    ImageIcon back = new ImageIcon("cardback.jpg"); 
    
    // make the following variables public so that they can be used by the TicTacEvent class
    JTextField txtAdidas;
    JTextField txtNike;
    JTextField txtTie;
    
    //loads the image to be used as the background of the buttons
    public TicTac() {  //creates the method to draw the game board
        super ("Tic Tac Toe");  //creates the Title for the App
        getContentPane().setBackground(new Color(153, 204, 204));
        setSize (600,500);  //sets the size of the outer frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        //sets the program to quit if the window is closed
        FlowLayout layout = new FlowLayout(); 
        /**arranges components from left to right, centering 
         * components horizontally with a five pixel gap between them.*/
        getContentPane().setLayout(layout); 
        int name = 0;  // creates a variable to keep track of box number
        String newname; // will be used to hold button names
        GridLayout layout1 = new GridLayout(3, 3, 12, 12); 
        //arranges the components in a rectangular grid, where all cells are of equal size.
        row1.setLayout(layout1);
        JOptionPane.showMessageDialog(null, "ADIDAS STARTS THE GAME"); 
        // show the message before the game boots that adidas starts
        for (int x=0; x<=2; x++){  //creates and adds the buttons to the GridLayout, goes up and down
            for (int y=0; y<=2; y++){  //goes across on the GridLayout
                name = name + 1; //adds one to the loop
                newname = Integer.toString(name);  //names newname from number 1-9
                boxes[x][y] = new JButton(newname);  //sets the boxes to show number 1-9
                boxes[x][y].setIcon(back);  //sets the images of the back of the buttons
                row1.add(boxes[x][y]);  //adds remaining components to the GridLayout.
            }
        }
       
        // add the reset button to the game board, this will reset the game board
        JButton btnReset = new JButton("Reset");
        // when the reset button is clicked the following code will occur
        btnReset.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		// loop that goes through all of the boxes to check them of they are disabled to reset them
        		for (int row = 0; row <=2; row++) {
        			for (int col = 0; col <=2; col++) {
        				// as the loop continues on each button is getting enabled
        				boxes[row][col].setEnabled(true);
        				// the icon is set to the carback image 
        				boxes[row][col].setDisabledIcon(tictac.c);
        				// the check is reset for each box so clicks is 0 to old memory is deleted
        				tictac.check[row][col] = 0;
        				// win is 0 so the gae can be played again
        				tictac.win = 0;
        				// number of clicks = 0 so that the game can be played again
        				tictac.clicks = 0;
        				// set the colours of the txtboxes back to white since they flash yellow when a win in the category is added
        		        txtAdidas.setBackground(Color.WHITE);
        		        txtNike.setBackground(Color.WHITE);
        		        txtTie.setBackground(Color.WHITE);
        			}
        		}
        	}
        });
        getContentPane().add(btnReset);
        
        // add the exit button to the game board to exit the game
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		// the frame exits
        		System.exit(0);
        	}
        });
        getContentPane().add(btnExit);
        
        // add the txtbox that shows how many wins x has
        txtAdidas = new JTextField();
        txtAdidas.setBackground(Color.WHITE);
        txtAdidas.setText("Adidas wins: 0");
        getContentPane().add(txtAdidas);
        txtAdidas.setColumns(10);
        
        // add the txtbox that shows how many wins o has 
        txtNike = new JTextField();
        txtNike.setText("Nike wins: 0");
        getContentPane().add(txtNike);
        txtNike.setColumns(10);
        
        // add the txtbox that shows how many games were tied
        txtTie = new JTextField();
        txtTie.setText("Ties: 0");
        getContentPane().add(txtTie);
        txtTie.setColumns(10);
        getContentPane().add (row1);

        for (int x=0; x<=2; x++){  //runs a loop to see which button was pressed
            for (int y=0; y<=2; y++){
                boxes[x][y].addActionListener(tictac);  //listens to button being clicked
            }
        }

        setVisible(true);  //shows the FlowLayout on the screen.
    }

    public static void main(String[] arguments){  
    	/**this is the main method in the program and invokes all the other 
    	 * methods required by your program*/
        TicTac frame = new TicTac();  //runs the screen layout class.
    }
}
