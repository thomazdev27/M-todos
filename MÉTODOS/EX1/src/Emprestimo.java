public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }
    public static int gettresParcelas() {
        return 3;
    }
    public static int getTaxaDuasParcelas() {
        return (int) 0.3;
    }
    public static int getTaxatresParcelas() {
        return (int) 0.45;
    }

    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor Final do empréstimo para 2 parcelas: R$" + valorFinal);
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * getTaxatresParcelas());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$" + valorFinal);

        }else {
            System.out.println("Quantidade de parcelas não aceita.");
        }


    }

}
