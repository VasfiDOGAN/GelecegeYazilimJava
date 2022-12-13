import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
//	  Konsoldan girilen string içerisinde hangi harften kaç tane bulunduğunu sıralı bir şekilde yazmak (arraylist kullanarak)
//	  Örnek: numan -> n2u1m1a1
    Scanner input = new Scanner(System.in);
    System.out.print("Lütfen bir string ifade girin: ");
    String str = input.nextLine();
    ArrayList<Character> charList = new ArrayList<Character>();
    for (int i = 0; i < str.length(); i++) {
      charList.add(str.charAt(i));
    }

    StringBuilder result = new StringBuilder();
    while (charList.size() > 0) {
      char currChar = charList.get(0);
      int count = 0;
      for (int i = 0; i < charList.size(); i++) {
        if (charList.get(i) == currChar) {
          count++;
          charList.remove(i);
          i--;
        }
      }
      result.append(currChar + "" + count);
    }
    System.out.println(result.toString());
  }
}
