// The Player rolls the die to get a number
//between 1 to 6. - Use ((RANDOM)) to get the number between
//1 to 6

import java.util.Random;

class SnakeAndLadder
{
	public static void main(String args[]) 
	{
	
	System.out.println("Start position of player is  0 ");
	int position = 0;

	Random rand = new Random();
	int nextPosition = rand.nextInt(6) + 1;
	
	System.out.println("after rolling die, number is  " +nextPosition);

	}
}