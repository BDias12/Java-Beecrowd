import java.util.Scanner;
import static java.lang.Math.abs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        int MaiorAB = (a + b + abs(a-b))/2;

        if(MaiorAB > c){
            System.out.printf("%d eh o maior\n", MaiorAB);
        } else{
            System.out.printf("%d eh o maior\n", c);
        }
    }
}