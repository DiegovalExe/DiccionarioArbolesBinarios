package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class txtReader{
    //URL DEL ARCHIVO A LEER, FAVOR DE MODIFICAR ANTES DE USAR.
    //D:\EstructuraDeDatosUVG\DiccionarioArbolesBinarios\src\words.txt

    public String fileURL;
    public ArrayList<Word> words = new ArrayList<>();

    public txtReader(String path){
        this.fileURL = path;
    }

    public txtReader() {
        this.fileURL = "D:\\EstructuraDeDatosUVG\\DiccionarioArbolesBinarios\\src\\words.txt";
    }

    /**
     * Funcion para leer el documento de texto
     * @return ArrayList con una linea del calculo en cada elemento
     */
    public ArrayList<Word> returnArrWords(){
        try {
            File myObj = new File(fileURL);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] line = myReader.nextLine().split(",");
                words.add(new Word(line[0].trim(),line[1].trim(),line[2].trim()));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            //ERROR
        }
        return words;
    }
}