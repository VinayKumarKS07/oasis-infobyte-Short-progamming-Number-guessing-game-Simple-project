package com.guessNumber;

import java.util.Random;

public class guessNumber {
	
	public int guessNumber(int num) {
		
//		int number = (int) (Math.random() * Math.pow(10, 2));
		Random rand = new Random();
		int randomNumber = rand.nextInt(100)+1;

		System.out.println("Random number generated is " + randomNumber);
		 if(num>randomNumber) {
		   System.out.println("Entered number is greater " + (num-randomNumber) + " than generated number " + randomNumber );	
	     }else if(num<randomNumber) {
	    	 System.out.println("Entered number is less " + (randomNumber-num) + " than generated number " + randomNumber);
	     }		
		return randomNumber;
	}
}
