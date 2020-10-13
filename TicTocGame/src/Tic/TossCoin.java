package Tic;

import java.util.Random;



public class TossCoin
{
	static String turn;
   public static void main(String[] args)
   {
      
      Random toss = new Random();
		
	if (toss.nextInt(2) == 0)
		turn = "O";
			else
				turn = "X";
		}
	
}