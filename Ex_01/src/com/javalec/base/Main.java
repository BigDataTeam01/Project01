package com.javalec.base;

import java.util.Scanner;

import com.javalec.LCY.Divide;
import com.javalec.PDG.Remainder;
import com.javalec.PJH.Add;
import com.javalec.PJH.Substract;
import com.javalec.WDH.Multiply;

public class Main {

	public static void main(String[] args) {
		// 숫자 3개 받기
		Scanner scanner = new Scanner(System.in);
		Divide divide = new Divide();
		Remainder remainder = new Remainder();
		Add add = new Add();
		Substract substract = new Substract();
		Multiply multiply = new Multiply();
		
		
//		int tot =0;
		int num1 =0;
		int num2 =0;
		int num3 =0;
		
		num1 =scanner.nextInt();						
		num2 =scanner.nextInt();
		num3 =scanner.nextInt();
		
		
		System.out.println(add.addcalc(num1, num2, num3));
		System.out.println(divide.devide(num1, num2, num3));
		System.out.println(multiply.multiply(num1, num2, num3));
		System.out.println(substract.substractcalc(num1, num2, num3));
		System.out.println(String.format(
				"%d, %d", remainder.remainder(num1, num2, num3)[0],
				remainder.remainder(num1, num2, num3)[1]) );
		
	}

}
