import java.util.Locale;
import java.util.Scanner;
public class ExibeVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir?");
        int number = scan.nextInt();

        double[] vet = new double [number];

        for ( int i = 0; i < number; i ++){
            System.out.print("Digite um número:");
            vet[i] = scan.nextDouble();
        }

        System.out.println();
        System.out.println("NÚMEROS DIGITADOS:");

        for (int i = 0; i < number; i ++) {
            System.out.println(String.format("%.1f", vet[i]));
        }

        scan.close();
    }
}
