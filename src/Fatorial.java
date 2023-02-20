/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja fatorar: ");
        int fatorial = scan.nextInt();

        int multiplica = 1;

        for ( int i = fatorial; i >= 1; i --) {
            multiplica = multiplica* i;
        }
        System.out.println(fatorial + "!= " + multiplica);
    }
}
