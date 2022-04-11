// The Player then checks for
 // a Option. They are No Play,
// Ladder or Snake. - Use ((RANDOM)) to check for Options

import java.util.Random;

class SnakeAndLadder
{
	public static void main(String args[]) 
	{
	
		System.out.println("Start position of player is  0 ");
		int currentPosition = 0;
		int count = 0;

		
		Random rand = new Random();

		do
		{	
			int nextPosition = rand.nextInt(6) + 1;
			count ++;
	
			System.out.println("after rolling die, number is  " +nextPosition);

			if(nextPosition == ladder)
			{		
				System.out.println("player moves ahead by  " + nextPosition + "number");
				int currentPosition+ = nextPosition;
				System.out.println("current position of player is  " + currentPosition);	
			}
			else if(nextPosition == snake)
			{	
				System.out.println("player moves behind by  " + nextPosition + "number");
				int currentPosition- = nextPosition;
				System.out.println("current position of player is  " + currentPosition);
			}
			else
			{
				System.out.println("player stays in same  position i.e. at" + currentPosition);
				int currentPosition = currentposition;
				System.out.println("current position of player is  " + currentPosition);		
			}
		}while (currentPosition <= 100);

		System.out.println("player plays dice   " + count + "  times to Win");
	
	}
}