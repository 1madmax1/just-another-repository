import java.util.Scanner;

class Calculator{
	public static void main(String args[]){
		Scanner Scanner = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first number: ");
		fnum = Scanner.nextDouble();
		System.out.println("Enter second number: ");
		snum = Scanner.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}   
}