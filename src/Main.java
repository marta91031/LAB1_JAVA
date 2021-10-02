import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String name = scan.next();
        System.out.print("Podaj nazwisko: ");
        String lastName = scan.next();
        System.out.print("Podaj wiek: ");
        String age = scan.next();
        System.out.print("Podaj nr indeksu: ");
        String id = scan.next();

        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);
        System.out.println("Indeks: " + id);

        System.out.printf("\nImię: %s\nNazwisko: %s\nWiek: %s\nIndeks: %s", name, lastName, age, id);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        int x = 5;
        int y = 10;
        int suma = x + y;
        int roznica = x - y;
        int iloraz = y/x;
        int iloczyn = x*y;
        int modulo = y%x;

        System.out.printf("\n\nSuma: %d\nRóżnica: %d\nIloraz: %d\nIloczyn: %d\nModulo: %d",suma,roznica,iloraz,iloczyn,modulo);

    }
}
