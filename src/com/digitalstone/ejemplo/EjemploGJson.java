package com.digitalstone.ejemplo;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploGJson {

    /*
    Este Programa lee un archivo json y lo convierte en un objeto java.
    */
    public static void main(String[] args) {
        
        System.out.println("Convieriendo un Archivo JSON en un OBJETO JAVA");

        //Variable que almacena la cadena json
        String json = "";
        try {
            
            //Se lee el archivo en un BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("ejemplo.json"));

            //Cada linea del archivo se concatena para que quede en una sola liena
            String linea;
            while ((linea = br.readLine()) != null) {
                json += linea;
            }

            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploGJson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploGJson.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("json: " + json);
        
        //Se delcara un nuevo gson
        Gson gson = new Gson();
        
        //aqui se castea el string que contiene el json a una clase java (los campos del json y los atrivutos de la cllase deben coincidir)
        Persona p = gson.fromJson(json, Persona.class);
        
        UtilMario utilMario = new UtilMario();
        utilMario.imprimeValoresVO(p);
        for(String aficion : p.getAficiones()){
            System.out.println(aficion);
        }
        
    }

}
