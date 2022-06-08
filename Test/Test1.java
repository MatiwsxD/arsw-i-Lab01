// Programa Java para ilustrar los usos mas frecuentes
// de Etiquetas de comentarios

/**
 * <h1>Encuentra un promedio de tres numeros!</h1>
 * El programa FindAvg implementa una aplicacion que
 * simplemente calcula el promedio de tres enteros y los imprime
 * a la salida en la pantalla.
 *
 * @author  Alex Walton
 * @version 1.0
 * @since   2017-15-12
 */
public class FindAvg
{
    /**
     * Este metodo se usa para encontrar un promedio de tres enteros.
     * @param numA Este es el primer parametro para encontrar el metodo Avg
     * @param numB Este es el segundo parametro para encontrar el metodo Avg
     * @param numC Este es el tercer parametro para encontrar el metodo Avg
     * @return int Esto devuelve un promedio de numA, numB y numC.
     */
    public int findAvg(int numA, int numB, int numC)
    {
        return (numA + numB + numC)/3;
    }

    /**
     * Este es el metodo principal que hace uso del metodo findAvg.
     * @param args sin usar.
     * @return Nada.
     */

    public static void main(String args[])
    {
        FindAvg obj = new FindAvg();
        int avg = obj.findAvg(10, 20, 30);

        System.out.println("El Promedio de 10, 20 y 30 es: " + avg);
    }
}