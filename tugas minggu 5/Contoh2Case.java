import java.util.Scanner;

public class Contoh2Case{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int angka;

		System.out.println("Masukkan Kode Kelas anda");
		angka = input.nextInt();

		switch(angka){
			case 1 :
				System.out.println("Kelas 1");
				break;
			case 2 :
				System.out.println("Kelas 2");
				break;
			case 3 :
				System.out.println("Kelas 3");
				break;
			case 4 :
				System.out.println("Kelas 4");
				break;
			default :
				System.out.println("Kode Salah");
		}

	}
}