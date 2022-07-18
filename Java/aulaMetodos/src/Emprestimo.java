public class Emprestimo {

    public static float descobrirJuros(int x){
        if (x > 0 && x <= 5 ){
            return 0.45f;
        } else if (x == 0 || x > 10) {
            return 0f;
        } else {
            return 0.85f;
        }
    }

    public static void calcularEmprestimo(float valor, int parcelas) {
        float valorJuros = descobrirJuros(parcelas);
        float valorFinal = valor;
        if(valorJuros != 0f) {
            for (int i = 1; i <= parcelas; i++) {
                valorFinal = valorFinal + (valorFinal * valorJuros);
            }
            System.out.println("O valor final do empréstimo com " + parcelas + " parcelas, é igual a: R$" + (valorFinal));
        } else {
            System.out.println("A quantidade de parcelas não é permitida.");
        }

    }


}
