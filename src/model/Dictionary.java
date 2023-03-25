package model;

import java.util.ArrayList;

public class Dictionary {
    private final txtReader txtReader = new txtReader();
    private BinarySearchTree<WordAssociation> spanishTree = new BinarySearchTree<>();
    private BinarySearchTree<WordAssociation> englishTree = new BinarySearchTree<>();
    private BinarySearchTree<WordAssociation> frenchTree = new BinarySearchTree<>();

    /**
     * LLena la informacion del diccionario con el documento prvisto
     */
    public void fillInfo(){
        ArrayList<Word> arr= txtReader.returnArrWords();

        for (Word word: arr) {
            spanishTree.insert(new WordAssociation(word.getSpanishWord(),word));
            englishTree.insert(new WordAssociation(word.getEnglishWord(),word));
            frenchTree.insert(new WordAssociation(word.getFrenchWord(),word));
        }
    }

    /**
     * Traduce la palabra dada
     * @param word palabra
     * @param lenguageTo lenguaje a traducir
     * @return palabra traducida
     */
    public String translate(String word, String lenguageTo){
        String lenguageFrom = detectLenguage(word);
        switch (lenguageFrom){
            case "Spanish":
                switch (lenguageTo){
                    case "Spanish":
                        return spanishTree.search(new WordAssociation(word,null)).getValue().getSpanishWord();
                    case "English":
                        return spanishTree.search(new WordAssociation(word,null)).getValue().getEnglishWord();
                    case "French":
                        return spanishTree.search(new WordAssociation(word,null)).getValue().getFrenchWord();
                    default:
                        return "Palabra sin traduccion";
                }
            case "English":
                switch (lenguageTo){
                    case "Spanish":
                        return englishTree.search(new WordAssociation(word,null)).getValue().getSpanishWord();
                    case "English":
                        return englishTree.search(new WordAssociation(word,null)).getValue().getEnglishWord();
                    case "French":
                        return englishTree.search(new WordAssociation(word,null)).getValue().getFrenchWord();
                    default:
                        return "Palabra sin traduccion";
                }
            case "French":
                switch (lenguageTo){
                    case "Spanish":
                        return frenchTree.search(new WordAssociation(word,null)).getValue().getSpanishWord();
                    case "English":
                        return frenchTree.search(new WordAssociation(word,null)).getValue().getEnglishWord();
                    case "French":
                        return frenchTree.search(new WordAssociation(word,null)).getValue().getFrenchWord();
                    default:
                        return "Palabra sin traduccion";
                }
            default:
                return "Idioma no identificado";
        }
    }

    /**
     * Detenca el lenguaje de la palabra a atravez de la key
     * @param word palabra
     * @return idioma de la palabra
     */
    public String detectLenguage(String word){
        if(spanishTree.contains(new WordAssociation(word,null))){
            return "Spanish";
        }
        if(englishTree.contains(new WordAssociation(word,null))){
            return "English";
        }
        if(frenchTree.contains(new WordAssociation(word,null))){
            return "French";
        }
        else {
            return "Idioma no detectado, prueba ingresando la palabra otra vez";
        }
    }
}
