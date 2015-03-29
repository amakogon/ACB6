package week2.day2;

/**
 * Created by amakogon on 29.03.15.
 */
public class TestString {
  public static void main(String[] args) {
    String s = "some string";
//    int a = 5;
    s = s + 5;
    System.out.println(s);

    String test = "test";

    System.out.println("length of string test = "
                         + test.length());

    char a = test.charAt(3);
    System.out.println("Char at index 3 in string test = " + a);


    for (int i = 0; i < test.length(); i++) {
      System.out.print(test.charAt(i));
    }

    String five = "5";

    int f = five.charAt(0);
    System.out.println("\n" + f);

    String first = "qwe";
    String sec = "qwe";
    if(first.equals(sec)) {
      System.out.println("String are equal");
    }
  }
}
