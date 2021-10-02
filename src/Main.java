import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        Scanner scan = new Scanner(System.in);
        double [] tablica = new double [5];

        for(int i = 0; i < tablica.length; i++)
        {
            System.out.printf("Podaj %d (liczba!)element tablicy\n", i+1);
            tablica[i] = Double.parseDouble(scan.next());
        }

        System.out.println("Twoja tablica:");
        for(int i = 0; i < tablica.length; i++)
        {
            System.out.println(tablica[i]);
        }


    }
}
