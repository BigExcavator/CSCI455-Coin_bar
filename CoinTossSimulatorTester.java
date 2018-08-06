// Name: Ruohan Sun
// USC NetID: 6539991087
// CS 455 PA1
// Spring 2018

/**
 * Class CoinTossSimulatorTester
 * Implement a set of test cases to check the correctness of CoinTossSimulator object.
 * 
 */
public class CoinTossSimulatorTester {
	
	public static void main (String args[]){
		
		CoinTossSimulator coin = new CoinTossSimulator();
		int totalTest=0;
		
		//The first round of test
		System.out.println("After constructor: ");
		helper(coin,totalTest);
		System.out.println("After run(1):");
		totalTest+=1;
		coin.run(1);
		helper(coin,totalTest);
		System.out.println("After run(10):");
		totalTest+=10;
		coin.run(10);
		helper(coin,totalTest);
		System.out.println("After run(100):");
		totalTest+=100;
		coin.run(100);
		helper(coin,totalTest);
		System.out.println("After run(500):");
		totalTest+=500;
		coin.run(500);
		helper(coin,totalTest);
		System.out.println("After run(1000):");
		totalTest+=1000;
		coin.run(1000);
		helper(coin,totalTest);
		System.out.println("After run(5000):");
		totalTest+=5000;
		coin.run(5000);
		helper(coin,totalTest);
		System.out.println("After run(100000):");
		totalTest+=100000;
		coin.run(100000);
		helper(coin,totalTest);
		System.out.println("After run(500000):");
		totalTest+=500000;
		coin.run(500000);
		helper(coin,totalTest);
		
		//reset the coin object
		coin.reset();
		totalTest=0;
		
		//The second round of test
		System.out.println("After reset:");
		helper(coin,totalTest);
		System.out.println("After run(10000000): ");
		totalTest+=10000000;
		coin.run(10000000);
		helper(coin,totalTest);
		System.out.println("After run(100000000): ");
		totalTest+=100000000;
		coin.run(100000000);
		helper(coin,totalTest);
		
		//finialTest
		coin.reset();
		totalTest=0;
		System.out.println("In the finall, after reset:");
		helper(coin,totalTest);
		 
	}
	
	/**
	   Check whether the numTrials match what we expected or not, 
	   and print out the necessary information
	 * @param coin_method
	 * @param totalTest
	 */
	private static void helper (CoinTossSimulator coin_method, int totalTest){
	
		System.out.println("Number of trials [exp:"+totalTest+"]: "+ coin_method.getNumTrials());
		System.out.println("Two-head tosses: " + coin_method.getTwoHeads());
		System.out.println("Two-tail tosses: " + coin_method.getTwoTails());
		System.out.println("One-head one-tail tosses: " + coin_method.getHeadTails());
		if (coin_method.getTwoHeads() + coin_method.getTwoTails() + coin_method.getHeadTails() == coin_method.getNumTrials()){
			System.out.println("Tosses add up correctly? " + "True" + "\n");
		}
		else{
			System.out.println("Tosses add up correctly? " + "False" + "\n");
		}
		
	}

}