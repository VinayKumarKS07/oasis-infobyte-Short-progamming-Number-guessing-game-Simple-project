package com.guessNumber;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		guessNumber guess = new guessNumber();
		Scanner sc= new Scanner(System.in);
		System.out.println("Guess the number");
		
		int number =0 ;
		int num=0;
		
		int i=0;
		do{
		if(i==0) {
			System.out.println("Enter the guessing number");
			number = sc.nextInt();
		    num =guess.guessNumber(number);
		}
		System.out.println();
		System.out.println("You still got a chance to guess Enter the guessing number");	
	    number = sc.nextInt();
	    num =guess.guessNumber(number);
	    System.out.println();
		if(number==num) {
			System.out.println("you have won the game");
			break;
		}
		
		i++;
		
	}while(i!=5);
		if(i==5 && number!=num) {
			System.out.println("You have no chances you have lost");
		}

}
	
}
