import java.util.Scanner;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        double Raio = sc.nextDouble();

        double volume = (4/3.0) * pi * Math.pow(Raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);







    }
}