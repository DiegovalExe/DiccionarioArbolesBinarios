import model.BinarySearchTree;
import model.Word;
import model.WordAssociation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BinarySearchTree<WordAssociation> englishTree = new BinarySearchTree<>();
        englishTree.insert(new WordAssociation("Gato",new Word("Cat","Gato","GatoFrances")));
        WordAssociation r = englishTree.search(new WordAssociation("Gato",null));
        System.out.println(String.valueOf(r.getValue().getFrenchWord()));

    }
}