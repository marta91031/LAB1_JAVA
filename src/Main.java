import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        System.out.println("Zadanie 1");

        String name = "Karolinka";
        byte wiek = 8;
        int ulLiczba = 5678;
        double numer = 7839.8987654387329;
        boolean like = true;
        System.out.print(name + "\n" + wiek + "\n" + ulLiczba + "\n"+ numer + "\n" + like  + "\n");

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        System.out.println("Zadanie 2");

        int liczbaA = 8;
        int liczbaB = 5;
        double liczbaX = 5.55;
        double liczbaY = 8.25;

        int suma = liczbaA + liczbaB;
        int roznica = liczbaA - liczbaB;
        int modulo = liczbaA%liczbaB;

        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(modulo);

        double sumaD = liczbaX + liczbaY;
        double roznicaD = liczbaX - liczbaY;
        double moduloD = liczbaY%liczbaX;

        System.out.println(sumaD);
        System.out.println(roznicaD);
        System.out.println(moduloD);

    }
}
