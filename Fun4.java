/*
17. Write a program that generates a random number and asks the user to guess what the 
	number is. If the user's guess is higher than the random number, the program should 
	display "Too high, try again." If the user's guess is lower than the random number, 
	the program should display "Too low, try again." The program should use a loop that
	repeats until the user correctly guesses the random number.
*/

class Fun4{
	public static void main(String[] args){
		int num,randno=56;
		do{
			System.out.print("Guess a number : ");
			num=new java.util.Scanner(System.in).nextInt();
			if(num>randno)
				System.out.println("Too high, try again.");
			else if(num<randno)
				System.out.println("Too low, try again.");
			else
				System.out.println("Yes, correct guess.");
		}while(num!=randno);
	}
}