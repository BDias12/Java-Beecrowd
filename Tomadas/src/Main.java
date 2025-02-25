import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int variavel = 0;
        int tomadas = 3;

        for(int i = 0; i < 4; i++){
           int input = sc.nextInt();
            variavel += input;
        }

        variavel -= tomadas;

        System.out.println(variavel);

        sc.close();
    }
}