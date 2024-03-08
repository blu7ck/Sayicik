import java.util.Random;
import java.util.Scanner;

public class Tahmin {

	public static void main(String[] args) {
		

		

			
				int tahmin, can = 3, i = 0;
				Random xyz = new Random();
				Scanner input = new Scanner(System.in);
				
				int sayi = xyz.nextInt(10);
				boolean oyunDurumu = false;
//				int[] denemeler = new int[3];
//				System.out.println(sayi);
				System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz");
				
				
				while(can>0) {
					System.out.println("\n0-10 Tahmin?");
					tahmin = input.nextInt();
//					denemeler[i++] = tahmin;
					if((tahmin <0) || (tahmin> 10)) {
						System.out.println("Lütfen geçerli değerler giriniz! ");
						continue;
					}
					if(tahmin==sayi) {
					oyunDurumu = true;
					break;
				}else{
					System.out.println("\ntekrar deneyiniz" + "\nKalan Deneme: "+ --can);
					System.out.println();
				}
						
				}
				if(oyunDurumu) {
					System.out.println("\nTebrikler, Doğru Tahmin! " );
				}else if(can<=0){
					System.out.println("GAME OVER!");
				}
//				System.out.println("\nTahminler:");
//				for(int value : denemeler) {
//					System.out.print(value + ", " + value);
//				}

		

	}

}
