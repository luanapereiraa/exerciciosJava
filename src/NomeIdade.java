/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;
public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        double idade;

        while (true) {
            System.out.println("Insira o nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Insira a idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Fim da execução do programa.");
    }
}
