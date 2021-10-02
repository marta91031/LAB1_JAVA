import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        int wiek = 23;

        if (wiek%3==0)
        {
            System.out.println("Podzielny przez 3.");
        }
        else
        {
            System.out.println("Niepodzielny przez 3.");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        int indeks = 57058;
        boolean wynik = indeks % 2 == 0 ? true : false;
        System.out.println(wynik);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        System.out.println("Podaj liczbę");
        Scanner scan = new Scanner(System.in);
        double liczba = Double.parseDouble(scan.next());

        if(liczba > 5)
        {
            System.out.println("Duża liczba");
        }
            else
        {
            System.out.println("Mała liczba");
        }



    }
}
