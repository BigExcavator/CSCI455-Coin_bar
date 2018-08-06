// Name: Ruohan Sun
// USC NetID: 6539991087
// CS 455 PA1
// Spring 2018

import java.util.Random;


/**
 * class CoinTossSimulator
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */
public class CoinTossSimulator {

	private int numTrials;
	private int twoHeads;
	private int twoTails;
	private int headTail;
	


   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {

   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.
      
      @param numTrials  number of trials to for simulation; must be >= 1
    */
   public void run(int numTrials) {

	   //do the coinToss simulation for numTrial times
	   Random rand=new Random();
	   int coin1=0;
	   int coin2=0;
	   for(int i=0;i<numTrials;i++) {
		   coin1=rand.nextInt(2);
		   coin2=rand.nextInt(2);
		   if(coin1==0 && coin2==0) {
			   twoHeads++;
		   }
		   else if(coin1==1 && coin2==1) {
			   twoTails++;
		   }
		   else {
			   headTail++;
		   }
	    }
	    this.numTrials +=numTrials;
	   
	   
   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
       return numTrials; 
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
       return twoHeads; 
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
       return twoTails; 
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
       return headTail; 
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
	   numTrials=0;
	   twoHeads=0;
	   twoTails=0;
	   headTail=0;
   }

}