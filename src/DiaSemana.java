// exibe o número a partir do dia da semana
public class DiaSemana {
    public static void main (String[] args) {
        String dia = "Segunda-Feira";

        switch (dia) {

            case "Segunda-Feira":
                System.out.println(1);
                break;
            case "Terça-Feira":
                System.out.println(2);
                break;
            case "Quarta-Feira":
                System.out.println(3);
                break;
            case "Quinta-Feira":
                System.out.println(4);
                break;
            case "Sexta-Feira":
                System.out.println(5);
                break;
            case "Sábado":
                System.out.println(6);
                break;
            case "Domingo":
                System.out.println(7);
                break;
        }

        System.out.println(dia + "!");
    }
}
