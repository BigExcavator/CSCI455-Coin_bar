// Name: Ruohan Sun
// USC NetID: 6539991087
// CS 455 PA1
// Spring 2018

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.util.Scanner;

/**
 * class CoinSimViewer
 * Contains the main method. Let user type in the number of trials
 * and creates the JFrame containing the CoinSimComponent
 * 
 * NOTE: The number of trials less than 1 are not allowed.  
 */
public class CoinSimViewer{
	public static void main(String args[]) {
		//read the user's input and make error checking
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of trials: ");
		int numTrials=in.nextInt();
		while(numTrials<1) {
			System.out.println("ERROR: Number entered must be greater than 0");
			System.out.print("Enter number of trials:" );
			numTrials=in.nextInt();
		}
		
		//initialize and make needed settlement of the main frame. 
		JFrame mainFrame=new JFrame();
		mainFrame.setTitle("CoinSim");
		mainFrame.setSize(800,500);
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//add components to the frame
		CoinSimComponent mainComponent=new CoinSimComponent(numTrials);
		mainFrame.add(mainComponent);
		mainFrame.setVisible(true);
		
		
	}
}