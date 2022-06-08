package edu.escuelaing.arsw.app;

import java.io.*;

/**
 * Estructura Main del programa
 * Aqui se recibe por parametro el tipo de operacion que desea hacer y la ruta de la cual quiere extraer las lineas
 * A partir de aqui, dependiendo de el tipo de operacion se hacen las oeraciones en una u otra clase
 * Dependiendo de la operacion suma 1 al contador o no
 *
 */
public class App 
{

    public static void main( String[] args ) throws IOException {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(args[1]));
            String line = reader.readLine();
            int x = 1;
            while (line != null) {
                line = reader.readLine();
                if(args[0].equals("phy")&&line != null){
                    x += Phy.count(line);
                }
                else if (args[0].equals("loc")&&line != null){
                    x += Loc.check(line);
                }
            }
            System.out.println(x);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
