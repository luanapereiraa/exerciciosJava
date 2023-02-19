/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int multiplicando = 1;
        int multiplicador;
        int produto;

        System.out.println("Qual tabuada deseja acessar?");
        multiplicador = scan.nextInt();

        System.out.println("TABUADA DO " + multiplicador);

        do {
            produto = multiplicador * multiplicando;

            System.out.println(multiplicando + "X" + multiplicador + "=" + produto);

            multiplicando ++;

        }while ( multiplicando < 11);

    }
}
