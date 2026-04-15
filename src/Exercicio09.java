import java.util.Scanner;

public class Exercicio09 {

    static void main() {
        Scanner sc = new Scanner(System.in);
        double i, num = 0;


        IO.println("Digite um numero: (0 para parar):");
        i = sc.nextDouble();

        while (i != 0) {
            num = i;
            i = sc.nextDouble();
            if ( num < i ){
                num = i;
            }

        }
        IO.println("Seu maior numero: " + num);
    }
}
