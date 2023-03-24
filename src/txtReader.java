import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class txtReader {
    private final String filepath;

    public txtReader(String filepath) {
        this.filepath = filepath;
    }
    public List<Palabra> leerPalabras(String url) throws FileNotFoundException{
        List<Palabra> listaPalabras = new ArrayList<>();
        File file = new File(filepath);
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] lineasSeparad = line.split(",");
            if(lineasSeparad.length == 3){
                String ingles = lineasSeparad[0];
                String espaniol = lineasSeparad[1];
                String frances = lineasSeparad[2];
                listaPalabras.add(new Palabra(espaniol,ingles,frances));
            }
        }
        sc.close();
        return listaPalabras;
    }
    public  String leerTexto() throws FileNotFoundException{
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(filepath);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            stringBuilder.append(sc.nextLine());
            stringBuilder.append("\n");
        }
        sc.close();
        return stringBuilder.toString();
    }

}
