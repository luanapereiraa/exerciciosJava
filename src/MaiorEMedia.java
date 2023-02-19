/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numero = 0;
        double maior = 0;
        double soma = 0;

        int i = 0;
        int ordem = 1;

        do {
            System.out.println("Digite o " + ordem + "º número:");
            numero = scan.nextDouble();
            ordem ++;

            soma += numero;

            if (numero > maior) maior = numero;
            i ++;
        } while (i < 5);

        System.out.println("Média dos números: " + soma/5);
        System.out.println("Maior número: " + maior);
    }
}
