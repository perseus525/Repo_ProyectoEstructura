package datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gabriel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Generator g = new Generator();
        String salida = "FECHA;M2,5;N°HOSPITALIZADOS\n";
        List<String> allData= g.generateData();
        String[] arrayData = allData.toArray(new String[allData.size()]);
        
        FileHandler f = new FileHandler("");
        for (String arrayData1 : arrayData) {
            salida += arrayData1;
        }
        f.escritura(salida, "aers.csv");
        //System.out.println(datos);
    }

}
