/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;
public class ImparesPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int pares = 0, impares = 0;
        int ordem = 1;

        System.out.println("Digite a quantidade de números que deseja inserir: ");
        quantidadeNumeros = scan.nextInt();

        int i = 0;

        do {
            System.out.println("Digite o " + ordem + "º número:");
            numero = scan.nextInt();
            ordem ++;

            if (numero % 2 == 0) pares ++;
            else impares ++;

            i ++;
        } while (i < quantidadeNumeros);

        System.out.println("QUANTIDADE DE NÚMEROS");
        System.out.println("Ímpares: " + impares);
        System.out.println("Pares: " + pares);
    }
}
