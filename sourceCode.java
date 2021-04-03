package JavaOdevler2;

import java.util.Scanner;

public class VergiHesaplama {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Aylık gelirinizi giriniz...");
		double gelir = input.nextDouble();
		double vergi;
		
		input.close();
		
		if(gelir <= 22_000) {
			
			System.out.println("0 < gelir < 22_000");
			vergi = gelir * 15 / 100;
			
		}else {
			if(gelir <= 49_000) {
				
				System.out.println("22_000 < gelir < 49_000");
				vergi = 3300 + (gelir - 22_000) * 20 / 100;
				
			} else {
				if(gelir <= 180_000) {
					
					System.out.println("49_000 < gelir < 180_000");
					vergi = 8700 + (gelir - 49_000) * 27 / 100;
					
				}else {
					if(gelir <= 600_000) {
						
						System.out.println("180_000 < gelir < 600_000");
						vergi = 44_070 + (gelir - 180_000) * 35 / 100;
						
					}else {
						
						System.out.println("600_000 < gelir < +++");
						vergi = 191_070 + (gelir - 600_000) * 40 / 100;
						
					}
				}
			}
		}
		System.out.printf("Ödenecek Vergi = %.2f", vergi);
	}
}
