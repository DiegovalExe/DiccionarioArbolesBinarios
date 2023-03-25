package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DictionaryTest {

    @Test
    void translate() {
        Dictionary dictionary = new Dictionary();
        dictionary.fillInfo();
        String word = dictionary.translate("casa","English");
        assertEquals(word,"house");
        String word2 = dictionary.translate("casa","French");
        assertEquals(word2,"loger");
    }
}