package model;

import com.sun.nio.sctp.Association;

public class WordAssociation  implements Comparable<WordAssociation> {
    private Association<String, String> association;

    public WordAssociation(String key, String value) {
        this.association = new Association<>(key, value);
    }

    public String getKey() {
        return association.getKey();
    }

    public String getValue() {
        return association.getValue();
    }

    @Override
    public int compareTo(WordAssociation other) {
        return this.getKey().compareTo(other.getKey());
    }
}
