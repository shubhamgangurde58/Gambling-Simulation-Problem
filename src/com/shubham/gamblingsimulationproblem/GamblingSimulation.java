package com.shubham.gamblingsimulationproblem;

public class GamblingSimulation {

		private static  final int STACK_PER_DAY= 100;
		private static final int BIT_PER_GAME = 1;
    
		public static void gameStatus() {
    	  System.out.println("STACK_PER_DAY = "+STACK_PER_DAY);
    	  System.out.println("BIT_PER_GAME = "+BIT_PER_GAME);
		}
    
		public static void main(String[] args) {
		
			System.out.println("Welcome to Gambling Simulation Problem");
		
			gameStatus();
		}
}
