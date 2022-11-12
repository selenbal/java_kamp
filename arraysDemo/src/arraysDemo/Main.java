package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String [] ogrenciler = new String[4];
		ogrenciler [0] = "ali";
		ogrenciler [1] = "veli";
		ogrenciler [2] = "ayse";
		ogrenciler [3] = "fatma";
		
		for (int i = 0; i < ogrenciler.length; i++){
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("---------------------");
		
		for (String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
