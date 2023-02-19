public class CalculadoraDeEstoque {
    public static void main (String[] args) {
        /*double somaLivros = 0;
        int contador = 0;

        while (somaLivros < 45) {
            double manga = 9.90;
            double livroDidatico = 40;
            double livroLiteratura = 29.99;

            somaLivros += manga + livroDidatico + livroLiteratura;

            //contador = contador + 1;
            //contador += 1;
            contador ++;*/

            double somaEstoque = 0;

            for (double i = 0; i < 45; i ++) {
                double manga = 9.90;
                double livroDidatico = 40;
                double livroLiteratura = 29.99;

                somaEstoque += manga + livroDidatico + livroLiteratura;

            }

        System.out.println("O seu valor em estoque é de R$:" + somaEstoque);

        if (somaEstoque < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (somaEstoque >= 2000) {
            System.out.println("Seu estoque está muito alto!");
        }
        else {
            System.out.println("Seu estoque está bom.");
        }
    }

}

