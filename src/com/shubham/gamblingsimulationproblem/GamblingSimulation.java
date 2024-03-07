package com.shubham.gamblingsimulationproblem;

import java.util.Random;

public class GamblingSimulation {

		private static  final int STACK_PER_DAY= 100;
		private static final int BIT_PER_GAME = 1;
		private static final int win = 1;
		private static final int loose = 0;
    
		private static final int[] winAmount = new int[20];
		private static final int[] looseAmount = new int[20];
		
		private static int monthly_total_win = 0;
		private static  int monthly_total_loose = 0 ;
					
		public static void gameStatus() {
    	  System.out.println("STACK_PER_DAY = "+STACK_PER_DAY);
    	  System.out.println("BIT_PER_GAME = "+BIT_PER_GAME);
    	  
		}
		public static void gamePlay() {
			gameStatus();
			
		 for(int i=0;i<20;i++) {
				
			 int winStack = 0;
			int looseStack = 0;
			System.out.println("Day"+(i+1));
			
			while(true) {
			
				Random random = new Random();
				int playStatus = random.nextInt(9)%2;
				
				if(playStatus == loose) {
					looseStack += 1;
				}else {
					winStack += 1;
				}
				if(winStack == STACK_PER_DAY/2 ) {
					 monthly_total_win += 1;
					break;
				}
				if(looseStack == STACK_PER_DAY/2) {
					monthly_total_loose += 1 ;
					break;
				}
				
			}		
			winAmount[i] = winStack;
			looseAmount[i] = looseStack;
	
			System.out.println("Win Stack ="+winStack);
			System.out.println("Loose Stack ="+looseStack);	

			System.out.println("---------------------------");
			
		 }
		 	System.out.println("monthly_total_win="+monthly_total_win);
		 	System.out.println("monthly_total_loose="+monthly_total_loose);
	}
    
		public static void main(String[] args) {
		
			System.out.println("Welcome to Gambling Simulation Problem");
			
			 gamePlay();
		
	}
}
