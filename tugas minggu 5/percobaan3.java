import java.util.Scanner;

public class percobaan3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int umur;

		System.out.println("Masukkan Umur : ");
		umur = sc.nextInt();

		if (umur > 60){
			System.out.println("Lansia");
		}
		
		else if (umur > 45){
			System.out.println("Tua");
		}
		
		else if (umur > 17){
			System.out.println("Dewasa");
		}

		else if (umur > 5){
			System.out.println("Anak - anak");
		}

		else if (umur > 0){
			System.out.println("Balitta");
		}
		else{
			System.out.println("Maaf umur yang anda masukkan salah");
		}
	}
}