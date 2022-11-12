package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 30;
		int sayi2 = 25;
		int sayi3 = 50;
		int temp = 0;
		
		if (sayi1 > sayi2) {
			temp = sayi1;
		}
		else {
			temp = sayi2;
		}
		if (temp > sayi3) {
			System.out.println("En buyuk sayi: " + temp);
		}
		else {
			System.out.println("En buyuk sayi: " + sayi3);
		}
			
		}

	}

