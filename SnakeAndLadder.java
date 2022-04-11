// The Player then checks for
 // a Option. They are No Play,
// Ladder or Snake. - Use ((RANDOM)) to check for Options

import java.util.Random;

class SnakeAndLadder
{
	public static void main(String args[]) 
	{
	
		System.out.println("Start position of player is  0 ");
		int firstPlayerCurrentPosition = 0;
		int secondPlayerCurrentPosition = 0;
		int firstPlayerCount = 0;
		int secondPlayerCount = 0;

		
		Random rand = new Random();

		do
		{	
			int firstPlayerNextPosition = rand.nextInt(6) + 1;
			firstPlayerCount ++;
			int secondPlayerNextPosition = rand.nextInt(6) + 1;
			secondPlayerCount ++;
	
			System.out.println("after rolling die, number is  " + firstPlayerNextPosition);

			for( ;firstPlayerNextPosition; )
			{
				if(firstPlayerNextPosition == ladder)
				{		
					continue;	
				}
				else if(firstPlayerNextPosition == snake)
				{	
					System.out.println("player 1moves behind by  " + firstPlayerNextPosition + "number");
					int firstPlayerCurrentPosition- = firstPlayerNextPosition;
					System.out.println("current position of player is  " + firstPlayerCurrentPosition);
				}
				else
				{
					System.out.println("player 1 stays in same  position i.e. at" + currentPosition);
					int firstPlayerCurrentPosition = currentposition;
					System.out.println("current position of player is  " + firstPlayerCurrentPosition);		
				}
			}

			for( ;secondPlayerNextPosition; )
			{
				if(secondPlayerNextPosition == ladder)
				{		
					continue;	
				}
				else if(secondPlayerNextPosition == snake)
				{	
					System.out.println("player 2 moves behind by  " + secondPlayerNextPosition + "number");
					int secondPlayerCurrentPosition- = secondPlayerNextPosition;
					System.out.println("current position of player is  " + secondPlayerCurrentPosition);
				}
				else
				{
					System.out.println("player  2 stays in same  position i.e. at" + secondPlayerCurrentPosition);
					int secondPlayerCurrentPosition = secondPlayerCurrentposition;
					System.out.println("current position of player is  " + secondPlayerCurrentPosition);		
				}
			}
		}while (firstPlayerCurrentPosition >= 100 || secondPlayerCurrentPosition >= 100);

		System.out.println("player 1 plays dice   " + firstPlayerCount + "  times to Win");
		System.out.println("player 2 plays dice   " + secondPlayerCount + "  times to Win");
	
	}
}