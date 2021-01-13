
package calculator;

import java.util.Scanner;
class calculations {
	
	
	
	public double addition(double x, double y){
		return (x+y);
		
		
	}
	
	public double subtraction(double x, double y) {
		return (x-y);
	}
	
	public double multiplication(double x, double y) {
		return (x*y);
		
	}
	public double division(double x, double y) {
		
		return (x/y);
	}
	

}

public class Calculator {

	public static void main(String[] args) {
		
		
double result=0,x,y;
		// TODO Auto-generated method stub
		calculations calc = new calculations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		x=sc.nextDouble();
		y = sc.nextDouble();
		System.out.println("The numbers are: "+x+","+y);
		System.out.println("Enter the operation: \n" + "1 for addition \n" + "2 for subtraction \n"
				+ "3 for multiplication \n" + "4 for division");

		int a = sc.nextInt();
		
		

		switch (a) {

		case 1:
			result=calc.addition(x, y);
			break;
		case 2:
			result=calc.subtraction(x, y);
			break;
		case 3:
			result=calc.multiplication(x, y);
			break;
		case 4:
			result=calc.division(x, y);

		default:
			break;

			
		}
		System.out.println(result);

		
		
	}

}
