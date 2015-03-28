package week2.day1;

/**
 * Created by amakogon on 28.03.15.
 */
public class Ex2 {
  public static void main(String[] args) {
    int[] mas = new int[5];

    int a = (int) (Math.random() * 20);
//    System.out.println(Math.random());
//    System.out.println(a);

    //Do not do this
    mas[0] = (int) (Math.random() * 20);
    mas[1] = (int) (Math.random() * 20);
    mas[2] = (int) (Math.random() * 20);
    mas[3] = (int) (Math.random() * 20);
    mas[4] = (int) (Math.random() * 20);

    System.out.println(mas[0]);
    System.out.println(mas[1]);
    System.out.println(mas[2]);
    System.out.println(mas[3]);
    System.out.println(mas[4]);


  }
}
