import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {

    /*
     * O laço WHILE determina enquanto uma condição for válida, o bloco de código será executado. O laço While teste a condição
     * antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado. 
     */


    public static void main(String[] args) {
        
        double mesada = 50.0;

        while(mesada>0){
            Double valorDoce = valoraleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doce.");
    }

    private static double valoraleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
