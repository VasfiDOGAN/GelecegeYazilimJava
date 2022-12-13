import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
//	  Konsoldan girilen string içerisinde hangi harften kaç tane bulunduğunu sıralı !!! bir şekilde yazmak (Map kullanarak)
//	  Örnek: numan -> n2u1m1a1
    Scanner input = new Scanner(System.in);
    System.out.print("Bir String(metin) giriniz: ");
    String kelime = input.nextLine();

    Map<Character, Integer> harfler = new HashMap<>();

    for (int i = 0; i < kelime.length(); i++) {
      char harf = kelime.charAt(i);
      if (!harfler.containsKey(harf)) {
        harfler.put(harf, 1);
      } else {
        int sayi = harfler.get(harf);
        harfler.put(harf, sayi + 1);
      }
    }

    for (Map.Entry<Character, Integer> entry : harfler.entrySet()) {
      char harf = entry.getKey();
      int sayi = entry.getValue();
      System.out.print(harf + "" + sayi);
    }
  }
}
