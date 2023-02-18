public class Beneficiarios {
    //verifica se o usuario está apto para receber o benefício
    public static void main (String[] args) {
        double salario = 1200.50;
        double mediaSalarial = 1510.80;

        int numeroDependentes = 3;
        int mediaDependentes = 2;

        if (salario < mediaSalarial && numeroDependentes >= mediaDependentes) {
            System.out.println("O usuário está apto para receber o benefício!");
        }
    }
}
