package model;

import java.util.ArrayList;

public class Dictionary {
    private final txtReader txtReader = new txtReader();
    private BinarySearchTree<WordAssociation> spanishTree = new BinarySearchTree<>();
    private BinarySearchTree<WordAssociation> englishTree = new BinarySearchTree<>();
    private BinarySearchTree<WordAssociation> frenchTree = new BinarySearchTree<>();
    public void fillInfo(){
        ArrayList<Word> arr= txtReader.returnArrWords();

        for (Word word: arr) {
            spanishTree.insert(new WordAssociation(word.getSpanishWord(),word));
            englishTree.insert(new WordAssociation(word.getEnglishWord(),word));
            frenchTree.insert(new WordAssociation(word.getFrenchWord(),word));
        }
    }

    public String translate(String word, String lenguage){

    }
}
