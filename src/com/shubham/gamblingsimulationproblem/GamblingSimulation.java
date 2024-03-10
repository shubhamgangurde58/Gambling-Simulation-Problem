package com.shubham.gamblingsimulationproblem;

import java.util.Random;

public class GamblingSimulation {

		private static  final int STACK_PER_DAY= 100;
		private static final int BIT_PER_GAME = 1;
		
		private static final int win = 1;
		private static final int loose = 0;
    
		private static final int[] winAmount = new int[20];
		private static final int[] looseAmount = new int[20];
		
		private static int total_win_day = 0;
		private static int total_loose_day = 0;
		
		private static int[] winday = new int[20];
		private static int[] looseday = new int[20];
		
		
		public static void gameStatus() {
    	  System.out.println("STACK_PER_DAY = "+STACK_PER_DAY);
    	  System.out.println("BIT_PER_GAME = "+BIT_PER_GAME);
    	  
		}
		public static void gamePlay() {
			gameStatus();
			
			  
			int maxwon = 0; 
			int maxloose = 0;
			 
			 int winindex = 0;
			 int looseindex = 0;
			 
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
						 total_win_day += 1;
						 
						 if(looseStack < winStack)
						 {
							 winday[i] = winStack - looseStack;
							 if(maxwon < winday[i])
							 {
								 maxwon = winday[i];
								 winindex = i + 1; 
							 }
						 }
						 break;
					}
						if(looseStack == STACK_PER_DAY/2) {
							total_loose_day += 1 ;
							
							if(looseStack > winStack)
							{
								looseday[i] = looseStack - winStack ;
								
								if(maxloose < looseday[i])	
								{
									maxloose = looseday[i];
									looseindex = i  + 1;
								}
								
							}
							break;
						}
						
					}		
					winAmount[i] = winStack;
					looseAmount[i] = looseStack;
		
					System.out.println("Win Stack ="+winStack);
					System.out.println("Loose Stack ="+looseStack);	
					
					System.out.println("---------------------------");
				 
		 	}
				 	System.out.println("Total_win_day="+total_win_day);
				 	System.out.println("Total_loose_day="+total_loose_day);
				 
				 	System.out.println("Day ="+winindex+" "+"luckiest day win rs="+maxwon);
				 	System.out.println("Day ="+looseindex+" "+"Unluckiest day loose rs="+maxloose);
			}
		    
		public static void main(String[] args) {
		
			System.out.println("Welcome to Gambling Simulation Problem");
			
			 gamePlay();
		
	}
}
