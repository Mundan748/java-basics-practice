/*
2. Write a program to calculate the sum of first 10 natural number.
*/

class Calsum{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=10;i++){
			sum+=i;
		}
		System.out.print("sum of first 10 natural number : "+sum);
	}
}