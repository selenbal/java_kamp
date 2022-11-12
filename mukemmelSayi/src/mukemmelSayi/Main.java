package mukemmelSayi;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//kendisi hariç tam bölenlerinin toplamına eşit olan sayılar mükemmel sayılardır
		Scanner inp = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int number = inp.nextInt();
		int sum = 0;
		for (int i=1; i<number; i++) {
			if (number%i == 0){
				sum = sum + i;
			}
		}
		if (sum == number){
			System.out.println("Bu bir mükemmel sayıdır.");
		}
		else {
			System.out.println("Bu bir mükemmel sayı değildir.");
		}
	}
}
