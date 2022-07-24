package mypack;

import java.util.Scanner;


public class CalculatorClass {
	static boolean restart = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,option=0;
			System.out.println("Welcome to Caluclator");
			System.out.println("Please enter your inputs first Option will appear for Operation ");
			
			System.out.println("Input 1st number");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			System.out.println("Input 2st number");
			b = sc.nextInt();
			System.out.println("Choose the Operation you want to perform (e.g. 1/2/3/4)");
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
			//System.out.println("Select your option");
			option = sc.nextInt();
			sc.close();
			
			System.out.println(operation(option,a,b));
		
		
		
	
		
	}

	private static int operation(int option,int a,int b) {
		// TODO Auto-generated method stub
		int result=0;
		restart = true;
		//int option = 0;
		switch(option) {
		case 1: System.out.println("Addition of number is :-");
		result = a+b;
		break;
		case 2: System.out.println("Substraction of number is :-");
		result = a-b;
		break;
		case 3: System.out.println("Multiplication of number is :-");
		result = a*b;
		break;
		case 4: System.out.println("Division of number is :-");
		if(b>0) {
			result = a/b;
		}else {
			System.out.println("You cannot divide number by 0");
		}
		break;
		default:System.out.println("Oops!.....Please select correct option");
		}
		return result;	
	}

}
