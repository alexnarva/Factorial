public class Factorial {

    /**
     * Calcula el factorial de un número entero positivo.
     *
     * @param numero Número entero positivo.
     * @return Factorial del número.
     */
    public static long factorial(int numero) {

        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }
}