import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;
        int e = 6;
        int f = 8;
        int g = 5;

        System.out.println(a||b && !(a||b));
        System.out.println((c||d) && (a&&b));
        System.out.println(d==b);
        System.out.println(a!=b&&b==d);
        System.out.println((e<f)&&(g<f));

    }
}
