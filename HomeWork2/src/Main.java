import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//       Konsoldan girilen ifadeyi zipleyip harfleri listeye atmak (arraylist kullanarak)
//       Örnek: numankaraaslan -> numakrsl
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir metin girin: ");
		String metin = input.nextLine();
		String zip = "";
		ArrayList<Character> kontrol = new ArrayList<Character>();
		for (int i = 0; i < metin.length(); i++) {
			char simdiki = metin.charAt(i);
			if (!kontrol.contains(simdiki)) {
				zip += simdiki;
				kontrol.add(simdiki);
			}
		}

		System.out.println("Zip hali: " + zip);
	}
}