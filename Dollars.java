/**
 * This utility class provides basic functionality for writing a change dispenser.
 */
public class Dollars {
	private Dollars() {}

	/**
	 * Takes a number of dollars to make change for, and returns the number
	 * of coins required to make change for that amount.  This follows the greedy algorithm
	 * for making change: taking the greatest number of quarters before dimes, greatest number
	 * of dimes before taking nickels, etc.
	 *
	 * @param dollars the number of dollars to make change for.
	 * @return the number of bills required to make change for the given number of dollars.
	 * This is completely derivitive of Coins.java but because coding is an art im calling it a homage 
	 */
	public static int numberOfDollarsFor(int dollars) {
		int ret = 0;
		ret += dollars / 100;
		dollars %= 100;
		ret += dollars / 50;
		dollars %= 50;
		ret += dollars / 20;
		dollars %= 20;
    	ret += dollars / 10;
		dollars %= 10;
    	ret += dollars / 5;
		dollars %= 5;
    	ret += dollars / 1;
		dollars %= 1;
		ret += dollars;
		return ret;
	}

	
	public static void dispense100(boolean beep) {
System.out.println("Placeholder 100");
    
/*System.out.println("____________________");
System.out.println("|100  /       \\ 100|");
System.out.println("|     |       |    |");
System.out.println("|100  \\       / 100|");
System.out.println("|_________________ | ");
            */
       
		if (beep) beep();
	}


	public static void dispense50(boolean beep) {
  System.out.println("Placeholder 50");
    
    
    
 /*System.out.println("____________________");
System.out.println("|50  /       \ 50| |");
System.out.println("|   |         |    |");
System.out.println("|50  \       / 50  |");
System.out.println("|_________________ | ");*/
		if (beep) beep();
	}


	public static void dispense20(boolean beep) {
      System.out.println("Placeholder 20");
    
/*System.out.println("____________________");
System.out.println("|20  /       \ 20| |");
System.out.println("|    |        |    |");
System.out.println("|20  \       / 20  |");
System.out.println("|_________________ | ");*/
		if (beep) beep();
	}
  public static void dispense10 (boolean beep) {
      System.out.println("Placeholder 10");
    /*
		System.out.println("____________________");
    System.out.println("|10  /       \ 10| |");
    System.out.println("|   |         |    |");
    System.out.println("|10  \       / 10  |");
    System.out.println("|_________________ | ");*/
		if (beep) beep();
	}
  public static void dispense5 (boolean beep) {
      System.out.println("Placeholder 5");
    /*
		System.out.println("____________________");
    System.out.println("|5   /       \   5 |");
    System.out.println("|   |         |    |");
    System.out.println("| 5  \       / 5   |");
    System.out.println("|_________________ | ");
    */
		if (beep) beep();
	}
  
  public static void dispense1 (boolean beep) {
		  System.out.println("Placeholder 1");
    /*
    System.out.println("____________________");
    System.out.println("|1   /       \   1 |");
    System.out.println("|    |        |    |");
    System.out.println("| 1  \       / 1   |");
    System.out.println("|_________________ | ");
    */
		if (beep) beep();
	}

	
	
  

	private static void beep() {
		System.out.println("\007");
		try{Thread.currentThread().sleep(333);}catch(Exception e){}
	}


}
