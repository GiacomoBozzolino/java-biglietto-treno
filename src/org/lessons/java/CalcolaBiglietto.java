package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci quanti km vuoi percorrere:");
		String strKm =in.nextLine();
        int  intKm = Integer.valueOf(strKm);
        
        System.out.print("Inserisci quanti anni hai:");
		String strAge =in.nextLine();
        int  intAge = Integer.valueOf(strAge);
        
        in.close();
        
        final float PRICE = 0.21F;
        
//        calcolo il prezzo base
        
        float basicPrice = intKm*PRICE;
        
        float finalPrice = basicPrice;
        
        if (intAge < 18) {
        	 finalPrice -= basicPrice * 0.20F;
			
		}
        
        if (intAge > 65) {
       	 finalPrice -= basicPrice * 0.40F;
			
		}
        
        System.out.println("il tuo biglietto costa:" + finalPrice + "€");
        
        
		
	}

}
