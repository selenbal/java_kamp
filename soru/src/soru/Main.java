package soru;

public class Main {

	public static void main(String[] args) {
		String str="welcomejava";
		int temp1 = 0;
		int temp2 = str.charAt(0) + str.charAt(1) + str.charAt(2);
		String hece1 = "";
		String hece2 = "";
		for (int i = 0; i < str.length()-2; i++) {
			int toplam = 0;
			String str2 = str.substring(i, i+3);
			char letter1 = str2.charAt(0);
			char letter2 = str2.charAt(1);
			char letter3 = str2.charAt(2);
			toplam = letter1 + letter2 + letter3;
			//System.out.println(str2); (ucluleri tek tek yazdirir)
			
			if (toplam > temp1) {
				temp1 = toplam;
				hece1 = str2;
			}
			if (toplam < temp2) {
				temp2 = toplam;
				hece2 = str2;
			}

		}
		System.out.println("ASCII degeri buyuk olan uclu: " + hece1);
		System.out.println("ASCII degeri: " + temp1);
		System.out.println("ASCII degeri kucuk olan uclu: " + hece2);
		System.out.println("ASCII degeri: " + temp2);
	}

}
