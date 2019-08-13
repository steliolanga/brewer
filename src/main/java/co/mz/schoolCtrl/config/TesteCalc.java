package co.mz.schoolCtrl.config;

import java.util.Scanner;

public class TesteCalc {

	static Scanner input;
	static double r;
	public static void main(String[] args) {
	
	 input=new Scanner(System.in);
	
	System.out.println("Escolha a Opcao: \n1: Somar \n2 Subtrair \n3 Multiplicar \n4 Dividir");

	double num1=input.nextDouble();
	double num2=input.nextDouble();
	int menu=input.nextInt();

	if(menu<5 && menu>0) {
		switch(menu) {
		
		case 1:
			r=num1+num2;
			
		
		case 2:
			r=num1-num2;			
		case 3:
			r=num1*num2;
		case 4:
			r=num1/num2;
		}
		System.out.println("Your result: "+ r);
		
		
	}else {
		System.out.println("Something happened wrong");
	}
	
	
	
}
	
}