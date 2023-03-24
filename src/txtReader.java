import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class txtReader {
    //URL DEL ARCHIVO A LEER, FAVOR DE MODIFICAR ANTES DE USAR.
    //D:\EstructuraDeDatosUVG\DiccionarioArbolesBinarios\src\words.txt

    public String fileURL;
    public ArrayList<Word> words = new ArrayList<>();

    public txtReader(String fileURL) {
        this.fileURL = fileURL;
    }

    /**
     * Funcion para leer el documento de texto
     * @return ArrayList con una linea del calculo en cada elemento
     */
    public ArrayList<Word> returnPostFix(){
        try {
            File myObj = new File(fileURL);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] line = myReader.nextLine().split(",");
                words.add(new Word(line[0],line[1],line[2]));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            //ERROR
        }
        return words;
    }