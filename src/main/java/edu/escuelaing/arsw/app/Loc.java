package edu.escuelaing.arsw.app;

public class Loc {
    public static boolean flag = true;

    public static Integer check(String line){
        /**
         * Para las operaciones Loc se usa esta clase
         * Esta clase mira si la linea abre, cierra o contiene dos slash seguidos, en caso de ser asi devuelve el entero en 0
         * De lo contrario deviuelve el entero en 1
         *
         */
        Integer cont = 0;
        line.replace(" ","");
        if(line.length()>1){
            if(line.contains("/*")){
                flag = false;
            }
            else if (flag && !line.contains("//")) {
                cont++;
            }
            else if (line.contains("*/")) {
                flag = true;
            }
        }
        return cont;
    }


}
