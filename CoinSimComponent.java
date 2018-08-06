// Name: Ruohan Sun
// USC NetID: 6539991087
// CS 455 PA1
// Spring 2018

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class CoinSimComponent
 * It's the main component of the frame
 * Initializes all the necessary data and runs the simulation
 * Using bar object for all the three results, and draw them in the right area.
 * 
 */

public class CoinSimComponent extends JComponent{
	private int numTrials;
	private int twoHeads;
	private int twoTails;
	private int headTail;
	
	public CoinSimComponent(int numTrials) {
		//initialize the coinTossSimulator object
		this.numTrials=numTrials;
		CoinTossSimulator coinToss=new CoinTossSimulator();
		coinToss.run(numTrials);
		
		//get the results of the coinToss test
		twoHeads=coinToss.getTwoHeads();
		twoTails=coinToss.getTwoTails();
		headTail=coinToss.getHeadTails();
		
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//get the width and height of the whole frame, and then define the needed parameters
		//we use relative size to let our bars fit into different window size
		int frameHeight=this.getHeight();
		int frameWidth=this.getWidth();
		int bottom=(int)(frameHeight*0.95);
		int width=(int)(frameWidth*0.0625);
		double scale=(frameHeight*0.8)/100;
		
		//change the percentage into nearest integers
		double precentTwoHeads=Math.round(((double)twoHeads/numTrials)*100);
		double precentTwoTails=Math.round(((double)twoTails/numTrials)*100);
		double precentHeadTail=Math.round(((double)headTail/numTrials)*100);
		
		//initialize and draw the three bars in the right area
		String label1="Two Heads:"+twoHeads+"("+(int)precentTwoHeads+")%";
		Bar bar1=new Bar(bottom, (int)(frameWidth*0.25-0.5*width), width, (int)precentTwoHeads, scale, Color.red, label1);
		bar1.draw(g2);
		
		String label2="A Head and a Tail:"+headTail+"("+(int)precentHeadTail+")%";
		Bar bar2=new Bar(bottom, (int)(frameWidth*0.5-0.5*width), width, (int)precentHeadTail, scale, Color.green, label2);
		bar2.draw(g2);
		
		String label3="Two Tails:"+twoTails+"("+(int)precentTwoTails+")%";
		Bar bar3=new Bar(bottom, (int)(frameWidth*0.75-0.5*width), width, (int)precentTwoTails, scale, Color.blue, label3);
		bar3.draw(g2);
		
		
	}
}