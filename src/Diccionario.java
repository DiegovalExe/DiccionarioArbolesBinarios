import java.util.ArrayList;

public class Diccionario {
    private final BinaryTree<Palabra> englishTree;
    private final BinaryTree<Palabra> frenchTree;
    private final BinaryTree<Palabra> spanishTree;
    public Diccionario() {
        this.englishTree = new BinaryTree<>();
        this.frenchTree = new BinaryTree<>();
        this.spanishTree = new BinaryTree<>();
    }
    public void agregarPalabras(ArrayList<Palabra> palabras) {
        for (Palabra palabra : palabras) {
            englishTree.insert(new Association<>(palabra.getIngles(), palabra));
            frenchTree.insert(new Association<>(palabra.getFrances(), palabra));
            spanishTree.insert(new Association<>(palabra.getEspaniol(), palabra));
        }
    }
}
