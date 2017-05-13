public class NestingLoops {

	/*  Study Drill:
			* 1. Which is faster? 
			* 	The 'C' part initialises first, however the
			*	'N' part goes through the entire loop before the 
			*	'C' part initialises it's second value.
			* 2. Change the first loop around.
			*	The print statement still prints the origional way, 
			* 	here then the first charachter is cycled through
			* 	before the sencond.
			* 3. Change print to println on "AB".
			*	This simply changes the print format to that
			*	of the "CN" loop.
			* 4. Add println between the "AB" loops.
			* 	Groups the printed statemets into loop groups (3 by 3).
			*/



	public static void main(String[] args) {
		//this is #1 - I'll call it "CN"
		for (int n=1; n <= 3; n++) {
			for (char c='A'; c <= 'E'; c++) {
				System.out.println( c + " " + n);
			}
		}

		System.out.println("\n");

		//this is #2 - I'll call "AB"
		for (int a=1; a <= 3; a++) {
			for (int b=1; b <= 3; b++) {
				System.out.print( "(" + a + "," + b + ") " );
			}
			// * You (me) will add some code here.
			System.out.println();
			
		}

		System.out.println("\n");
	}
}
