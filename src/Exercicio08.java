import java.util.Scanner;

public class Exercicio08 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Digite um numero :");
        int numeroresposta = sc.nextInt();

        int contador = 1;
        int soma =  0;


        while (contador <= numeroresposta) {
            if  (contador % 2 == 0) {
                soma += contador;
            }
            contador++;
        }

        IO.println("Soma: " + soma);



        }


    }
