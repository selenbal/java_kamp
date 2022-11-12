package sesliHarfler;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.print("Bir sesli harf giriniz: ");
		Scanner inp = new Scanner(System.in);
		String letter = inp.next();
		
		switch(letter) {
		case "A": case "a":
		case "I": case "ı":
		case "O": case "o":
		case "U": case "u":
			System.out.println("Bu harf kalındır.");
			break;
		case "E": case "e":
		case "İ": case "i":
		case "Ö": case "ö":
		case "Ü": case "ü":
			System.out.println("Bu harf incedir.");
			break;
		default:
			System.out.println("Yanlış değer girdiniz. Lütfen tek bir harf girin.");
		
		}
	}

}
