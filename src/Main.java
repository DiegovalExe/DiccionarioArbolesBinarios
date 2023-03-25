import UI.Ui;
import model.BinarySearchTree;
import model.Dictionary;
import model.Word;
import model.WordAssociation;

import java.util.ArrayList;

public class Main {
    private static final Ui ui = new Ui();
    private static final Dictionary dictionary = new Dictionary();
    public static void main(String[] args) {

        runDiccionary();

    }

    /**
     * Corre el diccionario
     */
    public static void runDiccionary(){
        dictionary.fillInfo();
        ui.print("----ARBOL EN INGLES RECORRIDO IN ORDER");
        dictionary.readInOrder();
        String[] words = ui.obtainWord().split(" ");
        int op = ui.obtainLenguageTo();
        String lenguajeTO = "";
        ArrayList<String> finalText = new ArrayList<>();
        switch (op){
            case 1:
                lenguajeTO = "Spanish";
                break;
            case 2:
                lenguajeTO = "English";
                break;
            case 3:
                lenguajeTO = "French";
                break;
        }
        for (String word: words) {
            finalText.add(dictionary.translate(word,lenguajeTO));
        }
        ui.print( String.join(" ", finalText));
    }
}