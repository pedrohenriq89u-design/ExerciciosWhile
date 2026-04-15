import java.util.Scanner;

public class Exercicio03 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Digite um numero:");
        int numero = sc.nextInt();

        int contador = 1;
        while (contador <= 10) {
            int resultado = numero * contador;
            IO.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }


    }
}
