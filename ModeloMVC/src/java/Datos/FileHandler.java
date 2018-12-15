package Datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class FileHandler {

    private final String ruta;

    /**
     *Inicializa una instancia de la clase FileHandler, a partir de la cual
     * se podra conseguir el contenido de los archivos en la ruta que se 
     * indique.
     * @param ruta en la cual estan los archivos que se usaran
     */
    public FileHandler(String ruta) {
        this.ruta = ruta;
    }

    /**
     *Metodo que retorna el contenido completo linea a linea de algun archivo
     * en la ruta definida en la creacion del objeto, en caso de errores se 
     * entregaran los errores por consola.
     * @param archivo, siendo este el nombre del archivo a leer 
     * @return un ArrayList con el contenido linea a linea del arhivo, si no hay
     * nada o hay un error se devolvera un ArrayList nulo
     */
    public ArrayList<String> lectura(String archivo) {

        ArrayList<String> datos = new ArrayList<>();

        // Fichero del que queremos leer
        File fichero = new File(ruta + archivo);
        //System.out.println(ruta+archivo);
        Scanner s = null;

        try {
            // Leemos el contenido del fichero
            s = new Scanner(fichero);

            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine(); 	// Guardamos la linea en un String
                //System.out.println(linea);
                datos.add(linea);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }

        /*
        for(Persona p : datos){
            System.out.println(p.toString1());
        }
         */
        return datos;
    }

    /**
     *Metodo que sobreescribe el contenido de un archivo en la ruta 
     * especificada al crear la instancia de FileHandler, en caso de errores 
     * estos seran mostrados por consola, ejercer precaucion, ya que el metodo
     * sobreescribe todos los datos.
     * @param strings un ArrayList que corresponde al nuevo contenido del 
     * archivo
     * @param archivo el nombre del archivo a escribir
     */
    public void escritura(ArrayList<String> strings,String archivo) {
        /**
         * FORMA 1 DE ESCRITURA *
         */
        FileWriter fichero = null;
        try {

            fichero = new FileWriter(ruta+archivo);
            

            // Escribimos linea a linea en el fichero
            for (String str : strings) {
                fichero.write(str + "\r\n");
            }

            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
    
    public void escritura(String str,String archivo){
        /**
         * FORMA 1 DE ESCRITURA *
         */
        FileWriter fichero = null;
        try {

            fichero = new FileWriter(ruta+archivo);

            // Escribimos linea a linea en el fichero
            fichero.write(str);

            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
}
