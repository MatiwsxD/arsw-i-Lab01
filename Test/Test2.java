/**
 * Este método se encarga de iniciar la ejecución del programar
 * Éste es el método principal del proyecto
 * @param args[] es un arreglo con los parámetros que el reciba por consola
 * @return void
 */
public static void main(String args[])
        {
        String saludo = mostrarSaludo("Juan");
        }

/**
 * Este método se encarga mostrar un saludo al usuario
 * @author JuanDMeGon
 * @param nombre es una cadena de texto con el nombre a usar
 * @return El mensaje usado para el saludo
 */
public static String mostrarSaludo(String nombre)
        {
        String mensaje = "Hola " + nombre;

        System.out.print(mensaje);

        return mensaje;
        }