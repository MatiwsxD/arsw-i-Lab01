package edu.escuelaing.arsw.app;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

        System.out.println( "Hello World! " + args[0] + " file:" + args[1] );

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    args[1]));
            String line = reader.readLine();
            int x = 0;
            while (line != null) {
                x++;
                line = reader.readLine();
            }
            System.out.println(x);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
