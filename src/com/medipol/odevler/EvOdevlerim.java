package com.medipol.odevler;

import java.util.Scanner;

class EvOdevlerim {

	public static void main(String[] args)
	// İkinci Derece Denklem Ödevi
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("(ax²+bx+c)İkinci Dereceden Bir Denklemdir. \n Denklemin Değerlerini Sırayla Giriniz...");
		System.out.println("a Değerini Giriniz: ");
		double a=sc.nextInt();
		System.out.println("b Değerini Giriniz: ");
		double b=sc.nextInt();						
		System.out.println("c Değerini Giriniz: ");
		double c=sc.nextInt();
		
		
		double delta =(b * b)-(4 * a * c);
		if (delta >0) {
			double x1=((-1*b)- Math.sqrt(delta))/(2 * a);
			double x2=((-1*b)+ Math.sqrt(delta))/(2 * a);
			System.out.println(" x1="+ x1 +  "\n x2="+ x2);						
		}
		if (delta <0) {
			System.out.println("Denklemin Gerçel Kökü Yoktur!");	
}
		if(delta==0) {
			double x= (-1 * b)/(2 * a);
			System.out.println("Çakışık Kökü Vardır: x1=x2"+x);
		}
		
	}

}
