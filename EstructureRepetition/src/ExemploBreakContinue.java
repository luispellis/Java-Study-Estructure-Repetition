public class ExemploBreakContinue {
    
    /*
     * Break significa quebrar, parar, frear, interromper. E é isso que se faz quando o JAVA encontra esse comando pela frente.
     * Continue, como o nome diz, ele 'continua' o laço. O comando Break interrompe o laço, já o continue interrompe somente a 
     * iteração  atual
     */

    public static void main(String[] args) {
        for ( int numero = 1; numero < 5; numero ++){
            if(numero == 3)
                continue;

            System.out.println(numero);
        }
    }

}
