import java.util.Scanner;

public class percobaan2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int nilai1, nilai2, median;

		System.out.println("Masukkan Nilai 1: ");
		nilai1 = sc.nextInt();
		System.out.println("Masukkan Nilai 2: ");
		nilai2 = sc.nextInt();

		median = (nilai1 + nilai2)/2;

		if (median >=100){
			median += 10;
		}

		else{
			median -=10;
		}

		System.out.println("Hasil nilai akhir adalah = " + median);
	}
}