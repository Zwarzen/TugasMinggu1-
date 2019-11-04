import java.util.Scanner;

public class Contoh2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int bayar;

		System.out.println("Masukkan total belanja : ");
		bayar = input.nextInt();

		if(bayar >= 2000000){
			System.out.println("Selamat Anda mendapat Hadiah Kompor");
		}

		if(bayar >= 1000000){
			System.out.println("Selamat Anda mendapat Hadiah Teflon");
		}

		if(bayar >= 500000){
			System.out.println("Selamat Anda mendapat Hadiah Piring");
		}

		else{
			System.out.println("Maaf anda belum beruntung");
		}
	}
}