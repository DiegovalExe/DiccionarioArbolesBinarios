package model;

import model.Assosiation;


public class WordAssociation  implements Comparable<WordAssociation> {
    private Assosiation<String, Word> association;

    /**
     * Asocia la palabra con su valor
     * @param key palabra
     * @param value objto palabra
     */

    public WordAssociation(String key, Word value) {
        this.association = new Assosiation<>(key, value);
    }

    public String getKey() {
        return association.getKey();
    }

    public Word getValue() {
        return association.getValue();
    }
    public String toString(){
        return "Key: "+association.getKey().toString() + " Valores asociados: " + association.getValue().toString();
    }
    /**
     * Compara con otras palabras
     * @param other the object to be compared.
     * @return comparacion
     */
    @Override
    public int compareTo(WordAssociation other) {
        return this.getKey().compareTo(other.getKey());
    }
}
