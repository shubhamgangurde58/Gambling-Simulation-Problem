package com.shubham.gamblingsimulationproblem;

import java.util.Random;

public class GamblingSimulation {

		private static  final int STACK_PER_DAY= 100;
		private static final int BIT_PER_GAME = 1;
		private static final int win = 1;
		private static final int loose = 0;
		
		private static int winStack = 0;
		private static int looseStack = 0;
    
		public static void gameStatus() {
    	  System.out.println("STACK_PER_DAY = "+STACK_PER_DAY);
    	  System.out.println("BIT_PER_GAME = "+BIT_PER_GAME);
    	  
    	  System.out.println("Win Stack ="+winStack);
    	  System.out.println("Loose Stack ="+looseStack);
		}
		
		public static void gamePlay() {
			
			Random random = new Random();
			int playStatus = random.nextInt(9)%2;
			System.out.println("playStatus ="+playStatus);
			
			if(playStatus == loose) {
				looseStack += 1;
			}else {
				winStack += 1;
			}
		}
    
		public static void main(String[] args) {
		
			System.out.println("Welcome to Gambling Simulation Problem");
		
			gameStatus();
			 gamePlay();
			gameStatus();
		}
}
